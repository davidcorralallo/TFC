package david.corral.tfc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import david.corral.tfc.entity.Clientes;
import david.corral.tfc.entity.Productos;
import david.corral.tfc.repository.ClientesRepository;

@Service
public class ClientesServiceImp implements IClientesService {

	@Autowired
	ClientesRepository cRepo;
	
	public void saveCliente(Clientes cliente) {
		cRepo.save(cliente);
		
	}
	
	public List<Clientes> buscarTodos() {
		System.out.println(cRepo.findAll());
		return cRepo.findAll();
	}

	public Clientes findById(Integer idCliente) {
		Optional <Clientes> idClienteEncontrado;
		idClienteEncontrado = cRepo.findById(idCliente);
		if(idClienteEncontrado.isPresent()) {
			Clientes c = idClienteEncontrado.get();
			return c;
		}
		return null;
		
	}

	public Page<Clientes> buscarTodosPageable(Pageable pageable) {
	    return cRepo.findAll(pageable);
	}

	

	



}
