package com.pagdevapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.pagdevapp.models.Devedor;

public interface DevedorRepository extends CrudRepository<Devedor, String>{
	
}
