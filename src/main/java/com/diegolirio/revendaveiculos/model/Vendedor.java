package com.diegolirio.revendaveiculos.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Vendedor extends Funcionario {

	private double comissao;
	
	@OneToMany(mappedBy="vendedor")
	private List<Ficha> fichas;

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public List<Ficha> getFichas() {
		return fichas;
	}

	public void setFichas(List<Ficha> fichas) {
		this.fichas = fichas;
	}
	
	
	
}
