package com.diegolirio.revendaveiculos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tipo {

	@Id @GeneratedValue
	private long id;
	
	private String descricao;
	
	//@OneToMany(mappedBy="tipo")
	//private Set<Modelo> modelos;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

//	public Set<Modelo> getModelos() {
//		return modelos;
//	}
//
//	public void setModelos(Set<Modelo> modelos) {
//		this.modelos = modelos;
//	}
	
	
	
	
}
