package david.corral.tfc.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import david.corral.tfc.entity.Coches;
import david.corral.tfc.repository.CochesRepository;

@Service
public class CochesServiceImp implements ICochesService {

	@Autowired
	CochesRepository cRepo;
	
	public List<Coches> buscarTodos() {
		return cRepo.findAll();
	}
	
	public Page<Coches> buscarTodosPageable(Pageable pageable) {
	    return cRepo.findAll(pageable);
	}
	

	public void eliminarCoche(int idCoche) {
		cRepo.deleteById(idCoche);
		
	}

	public Coches findById(Integer idCoche) {
		Optional<Coches> idCocheEncontrado;
		idCocheEncontrado = cRepo.findById(idCoche);
		if(idCocheEncontrado.isPresent()) {
			Coches c = idCocheEncontrado.get();
			return c;
		}
		return null;
	}

	public void save(Coches coche) {
        System.out.println(coche);
		cRepo.save(coche);
	}



	

}
