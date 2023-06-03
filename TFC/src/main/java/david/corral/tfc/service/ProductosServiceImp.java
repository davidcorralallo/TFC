package david.corral.tfc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import david.corral.tfc.entity.Productos;
import david.corral.tfc.repository.ProductosRepository;

@Service
public class ProductosServiceImp implements ICochesService {

	@Autowired
	ProductosRepository pRepo;
	
	public List<Productos> buscarTodos() {
		return pRepo.findAll();
	}

	public void eliminarProducto(int idProducto) {
		pRepo.deleteById(idProducto);
		
	}

	public Productos findById(Integer idProducto) {
		Optional<Productos> idProductoEncontrado;
		idProductoEncontrado = pRepo.findById(idProducto);
		if(idProductoEncontrado.isPresent()) {
			Productos p = idProductoEncontrado.get();
			return p;
		}
		return null;
	}

	public void save(Productos producto) {
		pRepo.save(producto);
	}

}
