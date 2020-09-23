package com.pagdevapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pagdevapp.models.Divida;

public interface DividaJpaRepository extends JpaRepository<Divida, Long> {

	Divida findById(long id);
	
}
