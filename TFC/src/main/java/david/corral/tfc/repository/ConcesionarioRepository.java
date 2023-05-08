package david.corral.tfc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import david.corral.tfc.entity.Concesionario;

public interface ConcesionarioRepository extends JpaRepository<Concesionario, Integer> {

}
