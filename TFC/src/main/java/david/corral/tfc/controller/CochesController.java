package david.corral.tfc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
import david.corral.tfc.repository.CochesRepository;
import david.corral.tfc.service.CochesServiceImp;

@Controller
@RequestMapping(value = "/coches")
public class CochesController {

	@Autowired
	CochesServiceImp cServ;
	
	@Autowired
	CochesRepository cRepo;
	
	/*
	@GetMapping("/lista")
    public String mostrarLista (Coches c, Model model) {
    	List <Coches> lista = cServ.buscarTodos();
    	model.addAttribute("c", lista);
    	System.out.println(lista);
		return "/coches/lista";
    }*/
	/*
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
	}*/
	
	@GetMapping(value ="/lista")
	public String findAll(@RequestParam Map<String, Object> params, Model model) {
		int page = params.get("page") != null ? (Integer.valueOf(params.get("page").toString()) - 1) : 0;
		
		PageRequest pageRequest = PageRequest.of(page, 3);
		
		Page< Coches> pageCoche = cServ.buscarTodosPageable(pageRequest);
		
		int totalPage = pageCoche.getTotalPages();
		if(totalPage > 0) {
			List<Integer> pages = IntStream.rangeClosed(1, totalPage).boxed().collect(Collectors.toList());
			model.addAttribute("pages", pages);
		}
		
		model.addAttribute("c", pageCoche.getContent());
		model.addAttribute("current", page + 1);
		model.addAttribute("next", page + 2);
		model.addAttribute("prev", page);
		model.addAttribute("last", totalPage);
		System.out.println(pageCoche);
		return "/coches/lista";
	}
	
	

	
	@GetMapping("/detalle/{id}")
    public String mostarDetalle (@PathVariable("id") int idCoche, Model model) {
    	Coches coche = cServ.findById(idCoche);
    	model.addAttribute("c", coche);
		return "/coches/detalle";
    }
	
	
	
}
