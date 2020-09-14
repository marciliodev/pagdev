package com.pagdevapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pagdevapp.models.Devedor;
import com.pagdevapp.models.Divida;
import com.pagdevapp.repository.DevedorRepository;
import com.pagdevapp.repository.DividaRepository;

@Controller
public class DividaController {

	@Autowired
	private DividaRepository dr;
	
	@Autowired
	private DevedorRepository der;
	
	@RequestMapping(value="/cadastrarDivida", method=RequestMethod.GET)
	public String form() {
		return "divida/formDivida";
	}	
	
	@RequestMapping(value="/cadastrarDivida", method=RequestMethod.POST)
	public String form(Divida divida) {
		
		dr.save(divida);
		
		return "redirect:/cadastrarDivida";
	}
	
	@RequestMapping("/dividas")
	public ModelAndView listaDividas() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Divida> dividas = dr.findAll();
		mv.addObject("dividas", dividas);
		return mv;	
	}
	
	@RequestMapping(value="/{idDivida}", method=RequestMethod.GET)
	public ModelAndView detalhesDivida(@PathVariable("idDivida") long idDivida) {
		Divida  divida = dr.findByIdDivida(idDivida);
		ModelAndView mv = new ModelAndView("divida/detalhesDivida");
		mv.addObject("divida", divida);
		
		Iterable<Devedor> devedores = der.findByDivida(divida);
		mv.addObject("devedores", devedores);
		
		return mv;
	}
	
	@RequestMapping(value="/{idDivida}", method=RequestMethod.POST)
	public String detalhesDividaPost(@PathVariable("idDivida") long idDivida, Devedor devedor) {
		Divida divida = dr.findByIdDivida(idDivida);
		devedor.setDivida(divida);
		der.save(devedor);
		return "redirect:/{idDivida}";
	}
}
