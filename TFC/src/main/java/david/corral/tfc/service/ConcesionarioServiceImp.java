package david.corral.tfc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import david.corral.tfc.entity.Concesionario;

import david.corral.tfc.repository.ConcesionarioRepository;

@Service
public class ConcesionarioServiceImp implements IConcesionarioService {

	@Autowired
	ConcesionarioRepository conRepo;
	
	
	public List<Concesionario> buscarTodos() {
		return conRepo.findAll();
	}
}
