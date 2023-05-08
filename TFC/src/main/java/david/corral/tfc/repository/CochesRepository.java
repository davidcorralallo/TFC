package david.corral.tfc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import david.corral.tfc.entity.Coches;

public interface CochesRepository extends JpaRepository<Coches, Integer> {

}
