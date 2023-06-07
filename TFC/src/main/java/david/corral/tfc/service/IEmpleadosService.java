package david.corral.tfc.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import david.corral.tfc.entity.Empleados;

public interface IEmpleadosService {

	List<Empleados> buscarTodos();
    
    void eliminarEmpleado(int idEmpleado);
    
    Empleados findById(Integer idEmpleado);
    
    void save(Empleados empleado);
    
    Page<Empleados> buscarTodosPageable(Pageable pageable);
}
