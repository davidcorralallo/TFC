	package david.corral.tfc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import david.corral.tfc.entity.Clientes;
import david.corral.tfc.service.ClientesServiceImp;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

	@Autowired
	ClientesServiceImp cServ;
	
	@GetMapping("/")
    public String mostrarUsuarios (Clientes c, Model model) {
    	List <Clientes> lista = cServ.buscarTodos();
    	model.addAttribute("c", lista);
    	System.out.println(lista);
		return "/admin/adminUsuarios";
    }
	/*
	@GetMapping("/")
    public String mostrarLista () {
		return "/admin/adminUsuarios";
    }*/
	
	
}
