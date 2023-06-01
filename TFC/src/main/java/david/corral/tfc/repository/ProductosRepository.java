package david.corral.tfc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import david.corral.tfc.entity.Productos;

public interface ProductosRepository extends JpaRepository<Productos, Integer> {

}
