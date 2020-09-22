package com.pagdevapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pagdevapp.models.Divida;
import com.pagdevapp.repository.DevedorRepository;
import com.pagdevapp.repository.DividaRepository;

@RestController
public class DividaControllerBack {

	@Autowired
	private DividaRepository dr;
	
	@Autowired
	private DevedorRepository der;
	
	@GetMapping("/listar/dividas")
	public List<Divida> listDividas() {
		return (List<Divida>) dr.findAll();
	} 
	
}
