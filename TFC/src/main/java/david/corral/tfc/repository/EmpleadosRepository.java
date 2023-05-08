package david.corral.tfc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import david.corral.tfc.entity.Empleados;

public interface EmpleadosRepository extends JpaRepository<Empleados, Integer> {

}
