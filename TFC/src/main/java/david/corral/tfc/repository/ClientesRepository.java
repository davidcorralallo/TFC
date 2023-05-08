package david.corral.tfc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import david.corral.tfc.entity.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Integer> {

}
