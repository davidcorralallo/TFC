package david.corral.tfc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import david.corral.tfc.entity.Clientes;
import david.corral.tfc.repository.ClientesRepository;

@Service
public class ClientesServiceImp implements IClientesService {

	@Autowired
	ClientesRepository cRepo;
	
	@Override
	public void saveCliente(Clientes cliente) {
		cRepo.save(cliente);
		
	}
	
	public List<Clientes> buscarTodos() {
		System.out.println(cRepo.findAll());
		return cRepo.findAll();
	}

}
