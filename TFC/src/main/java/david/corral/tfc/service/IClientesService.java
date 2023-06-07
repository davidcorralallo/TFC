package david.corral.tfc.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import david.corral.tfc.entity.Clientes;

public interface IClientesService {
	
	void saveCliente(Clientes cliente);
    
    List<Clientes> buscarTodos();
    
    Clientes findById(Integer idCliente);
    
    Page <Clientes> buscarTodosPageable(Pageable pageable);
}
