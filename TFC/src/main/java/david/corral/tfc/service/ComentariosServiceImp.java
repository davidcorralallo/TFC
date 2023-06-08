package david.corral.tfc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import david.corral.tfc.entity.Coches;
import david.corral.tfc.entity.Comentarios;
import david.corral.tfc.repository.ComentariosRepository;

@Service
public class ComentariosServiceImp implements IComentariosService {

	@Autowired
	ComentariosRepository comentariosRepository;
	
	public List<Comentarios> obtenerComentariosPorCoche(Coches coche) {
	    List<Comentarios> comentarios = comentariosRepository.findByCoche(coche);
		return comentarios;
	}


	public void save(Comentarios comentario) {
		comentariosRepository.save(comentario);
		
	}

}
