package com.diegolirio.revendaveiculos.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.diegolirio.revendaveiculos.model.Marca;
import com.diegolirio.revendaveiculos.service.MarcaService;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private MarcaService marcaService;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(Locale locale, Model model) {
		logger.info("Welcome home!");		
		return "test";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "index";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list() {
		return "list";
	}		
	
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public String view() {
		return "view";
	}		
	
	@RequestMapping(value = "/criar_cadastro_inicial", method = RequestMethod.GET)
	public String createInitCadastro() {
		// se nao existe Ferrari 
		Marca ferrari = new Marca();
		ferrari.setDescricao("Ferrari");
		this.marcaService.save(ferrari); 
		return "index";
	}
	
	
}
