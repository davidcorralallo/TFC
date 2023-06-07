package david.corral.tfc.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import david.corral.tfc.entity.Coches;

public interface ICochesService {

	List<Coches> buscarTodos();
    
    Page<Coches> buscarTodosPageable(Pageable pageable);
    
    void eliminarCoche(int idCoche);
    
    Coches findById(Integer idCoche);
    
    void save(Coches coche);

}
