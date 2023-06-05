package david.corral.tfc.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import david.corral.tfc.entity.Coches;

public interface ICochesService {

	Page<Coches> buscarTodosPageable(Pageable pageable);

}
