package com.pagdevapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pagdevapp.models.Divida;
import com.pagdevapp.repository.DividaRepository;

@Controller
public class DividaController {

	@Autowired
	private DividaRepository dr;
	
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
}
