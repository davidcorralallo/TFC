package david.corral.tfc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import david.corral.tfc.entity.Coches;
import david.corral.tfc.entity.Comentarios;
import david.corral.tfc.service.CochesServiceImp;
import david.corral.tfc.service.ComentariosServiceImp;

@Controller
@RequestMapping(value = "/comentarios")
public class ComentariosController {

	@Autowired
	ComentariosServiceImp cServ;
	
	@Autowired
	CochesServiceImp coServ;
	
	static Coches cochesDetalle = new Coches();
	
	@GetMapping("/añadir")
	public String añadirComentario(Comentarios comentario, Model model) {
		model.addAttribute("comentario", comentario);
		model.addAttribute("c", CochesController.cochesDetalle);
		System.out.println(CochesController.cochesDetalle);
		return "/ComentariosForm";
	}
	
	@PostMapping("/save")
    public String guardarProducto(Comentarios comentario, Model model) {
        comentario.setCoche(CochesController.cochesDetalle);
        cServ.save(comentario);
        return "redirect:/coches/lista";
    }
}



