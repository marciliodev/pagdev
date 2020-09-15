package com.pagdevapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.pagdevapp.models.Devedor;
import com.pagdevapp.models.Divida;

public interface DevedorRepository extends CrudRepository<Devedor, String>{
	Iterable<Devedor> findByDivida(Divida divida);
	Devedor findByCpfDevedor(String cpfDevedor);
}
