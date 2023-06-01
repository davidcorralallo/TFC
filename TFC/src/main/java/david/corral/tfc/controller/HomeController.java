package david.corral.tfc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import david.corral.tfc.entity.Clientes;
import david.corral.tfc.entity.Perfiles;
import david.corral.tfc.service.IClientesService;

@Controller
public class HomeController {
	
	@Autowired
	IClientesService ServClientes;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@GetMapping("/")
    public String mostrarHome(Authentication auth) {
    	return "/Home";
    }
	
	@GetMapping("/login")
    public String login(@RequestParam(value = "error", required = false) String error, Model model)
 {
		if (error != null) {
            model.addAttribute("errorMessage", "Credenciales inválidas"); // Mensaje de error personalizado
        }
    	return "logIn";
    }
	
	@GetMapping("/singup")
    public String singup(Clientes cliente) {
    	return "/singup";
    }
	
	
	@GetMapping("/contacto")
    public String mostrarContacto() {
    	return "/contacto";
    }
	
	@GetMapping("/productos")
    public String mostrarProductos() {
    	return "/productos";
    }
	
	@PostMapping("/saveuser")
    public String guardarRegistro(Clientes cliente, RedirectAttributes attributes) {
    	String pwdPlano = cliente.getPassword(); //Aqui encriptamos la contraseña
    	String psdEncriptado = passwordEncoder.encode(pwdPlano);
    	cliente.setPassword(psdEncriptado);
    	
    	cliente.setEstatus(1); //Activado por defecto
    	cliente.setFechaRegistro(new Date());
    	List<Perfiles> lista = new ArrayList<>() ;
    	Perfiles perfil = new Perfiles();
    	perfil.setId(2); //Perfil de cliente
    	lista.add(perfil);
    	cliente.setPerfiles(lista);
    	System.out.println(cliente);
    	ServClientes.saveCliente(cliente);
    	attributes.addFlashAttribute("msg", "El registro fue guardado correctamente!");
    	
    	return "redirect:/";
    	
    }
    
    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
    	SecurityContextLogoutHandler logoutHandler = new SecurityContextLogoutHandler();
    	logoutHandler.logout(request, null, null);
    	return "redirect:/login";
    }
    
}
