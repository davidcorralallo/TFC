package david.corral.tfc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import david.corral.tfc.entity.Coches;
import david.corral.tfc.entity.Comentarios;

public interface ComentariosRepository extends JpaRepository<Comentarios, Integer> {

	List<Comentarios> findByCoche(Coches coche);

}
