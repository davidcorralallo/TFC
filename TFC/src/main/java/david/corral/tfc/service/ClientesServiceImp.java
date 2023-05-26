package david.corral.tfc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import david.corral.tfc.entity.Clientes;
import david.corral.tfc.repository.ClientesRepository;

@Service
public class ClientesServiceImp implements IClientesService {

	@Autowired
	ClientesRepository clientesRepo;
	
	@Override
	public void saveCliente(Clientes cliente) {
		clientesRepo.save(cliente);
		
	}

}
