package david.corral.tfc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import david.corral.tfc.entity.Coches;
import david.corral.tfc.entity.Productos;
import david.corral.tfc.service.CochesServiceImp;

@Controller
@RequestMapping(value = "/coches")
public class CochesController {

	@Autowired
	CochesServiceImp cServ;
	/*
	@GetMapping("/lista")
    public String mostrarLista (Coches c, Model model) {
    	List <Coches> lista = cServ.buscarTodos();
    	model.addAttribute("c", lista);
    	System.out.println(lista);
		return "/coches/lista";
    }*/
	
	@GetMapping("/lista")
	public String mostrarLista(@RequestParam(defaultValue = "0") int page, Model model) {
	    int pageSize = 1; // Número de elementos por página

	    Pageable pageable = PageRequest.of(page, pageSize);
	    Page<Coches> cochesPage = cServ.buscarTodosPageable(pageable);

	    List<Coches> cochesList = cochesPage.getContent();
	    int totalPages = cochesPage.getTotalPages();

	    model.addAttribute("c", cochesList);
	    model.addAttribute("totalPages", totalPages);
	    model.addAttribute("currentPage", page);

	    return "/coches/lista";
	}

	
	@GetMapping("/detalle/{id}")
    public String mostarDetalle (@PathVariable("id") int idCoche, Model model) {
    	Coches coche = cServ.findById(idCoche);
    	model.addAttribute("c", coche);
		return "/coches/detalle";
    }
	
	
	
}
