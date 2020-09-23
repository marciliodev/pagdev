package com.pagdevapp.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pagdevapp.models.Divida;
import com.pagdevapp.repository.DividaJpaRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Dividas e Cobranças")
@CrossOrigin(origins = "*")
public class DividaControllerBack {

	@Autowired
	private DividaJpaRepository dividaJpaRepository;
	
	@GetMapping("/dividas")
	@ApiResponses(value = {
		    @ApiResponse(code = 200, message = "Retorna a lista de dividas"),
		    @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
		    @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
		})
	@ApiOperation(value="Retorna lista de dividas")
	public List<Divida> listaDividas() {
		return dividaJpaRepository.findAll();
	} 
	
	@GetMapping("/divida/{id}")
	@ApiResponses(value = {
		    @ApiResponse(code = 200, message = "Retorna uma divida unica"),
		    @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
		    @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
		})
	@ApiOperation(value="Retorna uma divida unica")
	public Divida listaDivida(@PathVariable(value="id") long id) {
		return dividaJpaRepository.findById(id);
	}
	
	@PostMapping("/divida")
	@ApiResponses(value = {
		    @ApiResponse(code = 200, message = "Salva uma divida"),
		    @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
		    @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
		})
	@ApiOperation(value="Salva uma divida")
	public Divida salvaDivida(@RequestBody Divida divida) {
		return dividaJpaRepository.save(divida);
	}
	
	@DeleteMapping("/divida")
	@ApiResponses(value = {
		    @ApiResponse(code = 200, message = "Deleta uma divida"),
		    @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
		    @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
		})
	@ApiOperation(value="Deleta uma divida")
	public void deletaDivida(@RequestBody Divida divida) {
		dividaJpaRepository.delete(divida);
	}
	
	@PutMapping("/divida")
	@ApiResponses(value = {
		    @ApiResponse(code = 200, message = "Atualiza uma divida"),
		    @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
		    @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
		})
	@ApiOperation(value="Atualiza uma divida")
	public Divida atualizaDivida(@RequestBody Divida divida) {
		return dividaJpaRepository.save(divida);
	}
	
	
}
