package david.corral.tfc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import david.corral.tfc.entity.Coches;
import david.corral.tfc.service.CochesServiceImp;

@Controller
@RequestMapping(value = "/coches")
public class CochesController {

	@Autowired
	CochesServiceImp cServ;
	
	@GetMapping("/lista")
    public String mostrarLista (Coches c, Model model) {
    	List <Coches> lista = cServ.buscarTodos();
    	model.addAttribute("c", lista);
    	System.out.println(lista);
		return "/coches/lista";
    }
	
	@GetMapping("/detalle")
	public String mostrarDetalle (Coches c, Model model) {
		return "/coches/detalle";
	}
	
	
}
