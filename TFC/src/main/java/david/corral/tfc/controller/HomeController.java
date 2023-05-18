package david.corral.tfc.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    public String mostrarHome() {
    	return "/Home";
    }
	
	@GetMapping("/login")
    public String mostrarLogIn() {
    	return "/logIn";
    }
	
	@GetMapping("/admin")
    public String mostrarAdmin() {
    	return "/admin";
    }
	
	@GetMapping("/coches")
    public String mostrarCoches() {
    	return "/coches";
    }
	
	@GetMapping("/productos")
    public String mostrarProductos() {
    	return "/productos";
    }
	
	@PostMapping("/signup")
    public String guardarRegistro(Clientes cliente, RedirectAttributes attributes) {
    	
    	String pwdPlano = cliente.getContraseña(); //Aqui encriptamos la contraseña
    	String psdEncriptado = passwordEncoder.encode(pwdPlano);
    	cliente.setContraseña(psdEncriptado);
    	
    	cliente.setEstatus(1); //Activado por defecto
    	cliente.setFechaRegistro(new Date());
    	
    	Perfiles perfil = new Perfiles();
    	perfil.setId(2); //Perfil de cliente
    	cliente.agregar(perfil);
    	
    	ServClientes.saveCliente(cliente);
    	attributes.addFlashAttribute("msg", "El registro fue guardado correctamente!");
    	
    	return "redirect:/singUp";
    	
    }
    
    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
    	SecurityContextLogoutHandler logoutHandler = new SecurityContextLogoutHandler();
    	logoutHandler.logout(request, null, null);
    	return "redirect:/login";
    }
}
