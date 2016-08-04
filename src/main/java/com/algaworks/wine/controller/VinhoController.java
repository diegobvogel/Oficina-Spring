package com.algaworks.wine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.wine.model.Vinho;
import com.algaworks.wine.repository.Vinhos;

@Controller
@RequestMapping("/vinhos")
public class VinhoController {
	
	@Autowired
	private Vinhos vinhos;

	@RequestMapping
	public ModelAndView pesquisa() {
		ModelAndView mv = new ModelAndView("/vinho/ListagemVinhos");
		mv.addObject("vinhos", vinhos.findAll());
		return mv;
	}
	
	@RequestMapping("/novo")
	public String novo() {
		return "/produto/CadastroProduto";
	}
	
}
