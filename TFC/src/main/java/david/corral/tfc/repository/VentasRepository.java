package david.corral.tfc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import david.corral.tfc.entity.Ventas;

public interface VentasRepository extends JpaRepository<Ventas, Integer> {

}
