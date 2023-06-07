package david.corral.tfc.service;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import david.corral.tfc.entity.Productos;

public interface IProductosService {

	List<Productos> buscarTodos();
    
    void eliminarProducto(int idProducto);
    
    Productos findById(Integer idProducto);
    
    void save(Productos producto);
    
    Page<Productos> buscarTodosPageable(Pageable pageable);
}
