package david.corral.tfc.controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import david.corral.tfc.entity.Coches;
import david.corral.tfc.entity.Comentarios;
import david.corral.tfc.repository.CochesRepository;
import david.corral.tfc.service.CochesServiceImp;
import david.corral.tfc.service.ComentariosServiceImp;

@Controller
@RequestMapping(value = "/coches")
public class CochesController {

	@Autowired
	CochesServiceImp cServ;
	
	@Autowired
	CochesRepository cRepo;
	
	@Autowired
	ComentariosServiceImp comentariosService;
	

	
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
	public String mostrarDetalle(@PathVariable("id") int idCoche, Model model, Comentarios comentario) {
	    Coches coche = cServ.findById(idCoche);
	    List<Comentarios> comentarios = comentariosService.obtenerComentariosPorCoche(coche);
	    model.addAttribute("c", coche);
	    model.addAttribute("comentarios", comentarios);
	    return "/coches/detalle";
	}
	
	
	
}
