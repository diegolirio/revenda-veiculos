package com.diegolirio.revendaveiculos.controller;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.diegolirio.revendaveiculos.model.Cambio;
import com.diegolirio.revendaveiculos.model.Cor;
import com.diegolirio.revendaveiculos.model.Foto;
import com.diegolirio.revendaveiculos.model.Loja;
import com.diegolirio.revendaveiculos.model.Marca;
import com.diegolirio.revendaveiculos.model.Modelo;
import com.diegolirio.revendaveiculos.model.Opcional;
import com.diegolirio.revendaveiculos.model.Tipo;
import com.diegolirio.revendaveiculos.model.Veiculo;
import com.diegolirio.revendaveiculos.model.Versao;
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
		ferrari.setUriImage("http://localhost:8080/revendaveiculos/static/images/marcas/ferrari.png");
		this.marcaService.save(ferrari); 
		
		Tipo carro = new Tipo();
		carro.setDescricao("Automovel");
		//this.tipoService.save(tipo);
		
		Modelo _458Italia = new Modelo();
		_458Italia.setDescricao("458 Italia");
		_458Italia.setMarca(ferrari);
		_458Italia.setTipo(carro);
		//this.modeloService.save(_458Italia);
		
		Cambio automatico = new Cambio();
		automatico.setDescricao("Automatico");
		//this.cambioService.save(automatico);
		
		Versao v8_32V = new Versao();
		v8_32V.setMotor(4.5f);
		v8_32V.setDescricao("V8 32V");
		//v8_32V.setCombustivel(gasolina);
		v8_32V.setQuantidadePortas(2);
		v8_32V.setCambio(automatico);
		v8_32V.setModelo(_458Italia);
		//this.versaoService.save(v8_32V);
		
		Cor vermelho = new Cor();
		vermelho.setDescricao("Vermelho");
		//this.corService.save(vermelho);
		
		Loja loja1 = new Loja();
		loja1.setDescricao("Loja 1");
		//this.lojaService.save(loja1);

		List<Opcional> opcionais = new LinkedList<Opcional>();		
		
		Veiculo ferrari458ItaliaAutomaticoV832V = new Veiculo();
		ferrari458ItaliaAutomaticoV832V.setAnoFabricacao(2012);
		ferrari458ItaliaAutomaticoV832V.setAnoModelo(2012);
		ferrari458ItaliaAutomaticoV832V.setChassi("SD65V1D65G14B6S51DVBD25");
		ferrari458ItaliaAutomaticoV832V.setCor(vermelho);
		ferrari458ItaliaAutomaticoV832V.setKm(10505.00d);
		ferrari458ItaliaAutomaticoV832V.setLoja(loja1);
		ferrari458ItaliaAutomaticoV832V.setOpcionais(opcionais);
		ferrari458ItaliaAutomaticoV832V.setPlaca("DFG2536");
		ferrari458ItaliaAutomaticoV832V.setRenavam("2365452");
		ferrari458ItaliaAutomaticoV832V.setVersao(v8_32V);
		ferrari458ItaliaAutomaticoV832V.setValorVenda(1229000.00d);
		//this.veiculoService.save(ferrari458ItaliaAutomaticoV832V);
		
		Foto foto1 = new Foto();
		foto1.setPrincipal(true);
		foto1.setUri("http://localhost:8080/revendaveiculos/static/images/veiculos/31281797_1.jpg");
		foto1.setVeiculo(ferrari458ItaliaAutomaticoV832V);
		//this.fotoService.save(foto1);
		
		Foto foto2 = new Foto();
		foto2.setPrincipal(false);
		foto2.setUri("http://localhost:8080/revendaveiculos/static/images/veiculos/31281798_2.jpg");
		foto2.setVeiculo(ferrari458ItaliaAutomaticoV832V);
		//this.fotoService.save(foto2);		
		
		Foto foto3 = new Foto();
		foto3.setPrincipal(false);
		foto3.setUri("http://localhost:8080/revendaveiculos/static/images/veiculos/31281799_3.jpg");
		foto3.setVeiculo(ferrari458ItaliaAutomaticoV832V);
		//this.fotoService.save(foto3);			
		
		Foto foto4 = new Foto();
		foto4.setPrincipal(false);
		foto4.setUri("http://localhost:8080/revendaveiculos/static/images/veiculos/31281800_4.jpg");
		foto4.setVeiculo(ferrari458ItaliaAutomaticoV832V);
		//this.fotoService.save(foto4);		
		
		Foto foto5 = new Foto();
		foto5.setPrincipal(false);
		foto5.setUri("http://localhost:8080/revendaveiculos/static/images/veiculos/31281801_5.jpg");
		foto5.setVeiculo(ferrari458ItaliaAutomaticoV832V);
		//this.fotoService.save(foto5);		
		
		Foto foto6 = new Foto();
		foto6.setPrincipal(false);
		foto6.setUri("http://localhost:8080/revendaveiculos/static/images/veiculos/31281804_6.jpg");
		foto6.setVeiculo(ferrari458ItaliaAutomaticoV832V);
		//this.fotoService.save(foto6);			
		
		return "index";
	}
	
	
}
