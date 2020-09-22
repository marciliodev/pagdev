package com.pagdevapp.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pagdevapp.models.Devedor;
import com.pagdevapp.models.Divida;
import com.pagdevapp.repository.DevedorRepository;
import com.pagdevapp.repository.DividaRepository;

//@RestController
@Controller
public class DividaControllerFront {

	@Autowired
	private DividaRepository dr;
	
	@Autowired
	private DevedorRepository der;
	
	@RequestMapping(value="/cadastrarDivida", method=RequestMethod.GET)
	public String form() {
		return "divida/formDivida";
	}	
	
	@RequestMapping(value="/cadastrarDivida", method=RequestMethod.POST)
	public String form(@Valid Divida divida, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			attributes.addFlashAttribute("mensagem", "Verifique os campos!");
			return "redirect:/cadastrarDivida"; 
		}
		dr.save(divida);
		attributes.addFlashAttribute("mensagem", "Divida cadastrada com sucesso!");
		return "redirect:/cadastrarDivida";
	}
	
	@RequestMapping("/dividas")
	public ModelAndView listaDividas() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Divida> dividas = dr.findAll();
		mv.addObject("dividas", dividas);
		return mv;	
	}
	
//	@GetMapping("/listar/dividas")
//	public List<Divida> listDividas() {
//		return (List<Divida>) dr.findAll();
//	} 
//	
	@RequestMapping(value="/{idDivida}", method=RequestMethod.GET)
	public ModelAndView detalhesDivida(@PathVariable("idDivida") long idDivida) {
		Divida  divida = dr.findByIdDivida(idDivida);
		ModelAndView mv = new ModelAndView("divida/detalhesDivida");
		mv.addObject("divida", divida);
		
		Iterable<Devedor> devedores = der.findByDivida(divida);
		mv.addObject("devedores", devedores);
		
		return mv;
	}
	
	@RequestMapping("/deletarDivida")
	public String deletarDivida(long idDivida) {
		Divida divida = dr.findByIdDivida(idDivida);
		dr.delete(divida);
		return "redirect:/dividas";
	}
	
	@RequestMapping(value="/{idDivida}", method=RequestMethod.POST)
	public String detalhesDividaPost(@PathVariable("idDivida") long idDivida, @Valid Devedor devedor, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			attributes.addFlashAttribute("mensagem", "Verifique os campos!");
			return "redirect:/{idDivida}"; 
		}
		Divida divida = dr.findByIdDivida(idDivida);
		devedor.setDivida(divida);
		der.save(devedor);
		attributes.addFlashAttribute("mensagem", "Devedor adicionado com sucesso!");
		return "redirect:/{idDivida}";
	}
	
	@RequestMapping("/deletarDevedor")
	public String deletarDevedor(String cpfDevedor) {
		Devedor devedor = der.findByCpfDevedor(cpfDevedor);
		der.delete(devedor);
		
		Divida divida = devedor.getDivida();
		long codigoLong = divida.getIdDivida();
		String codigo = "" + codigoLong;
		return "redirect:/" + codigo;
	}
	// Formulario edição divida
    @RequestMapping(value="/pagarDivida", method=RequestMethod.GET)
    public ModelAndView pagarDivida(long idDivida) {
        Divida divida = dr.findByIdDivida(idDivida);
        ModelAndView mv = new ModelAndView("divida/pagarDivida");
        mv.addObject("divida", divida);
        return mv;
    }

    // Updating divida
    @RequestMapping(value="/pagarDivida", method=RequestMethod.POST)
    public String updateDivida(@Valid Divida divida, BindingResult result, RedirectAttributes attributes) {
        dr.save(divida);
        attributes.addFlashAttribute("mensagem", "Divida paga com sucesso!");
        return "redirect:/dividas";
    }
}
