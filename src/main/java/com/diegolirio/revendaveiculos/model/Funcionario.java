package com.diegolirio.revendaveiculos.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Funcionario extends Pessoa {

	private double salario;
	
	@ManyToOne
	private Cargo cargo;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	
	
}
