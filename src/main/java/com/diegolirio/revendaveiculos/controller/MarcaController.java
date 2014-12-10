package com.diegolirio.revendaveiculos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/marca")
public class MarcaController {

	@RequestMapping(value="/get/list", method=RequestMethod.GET)
	public String pageList() {
		return "marca/list";
	}
	
}
