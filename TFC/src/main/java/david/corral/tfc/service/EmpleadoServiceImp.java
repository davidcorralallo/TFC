package david.corral.tfc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import david.corral.tfc.entity.Empleados;
import david.corral.tfc.repository.EmpleadosRepository;



@Service
public class EmpleadoServiceImp implements IEmpleadosService {

	@Autowired
	EmpleadosRepository eRepo;
	
	public List<Empleados> buscarTodos() {
		System.out.println(eRepo.findAll());
		return eRepo.findAll();
	}

	public void eliminarEmpleado(int idEmpleado) {
		eRepo.deleteById(idEmpleado);
		
	}

	public Empleados findById(Integer idEmpleado) {
		Optional<Empleados> idEmpleadoEncontrado;
		idEmpleadoEncontrado = eRepo.findById(idEmpleado);
		if(idEmpleadoEncontrado.isPresent()) {
			Empleados e = idEmpleadoEncontrado.get();
			return e;
		}
		return null;
	}

}
