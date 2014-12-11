package com.diegolirio.revendaveiculos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegolirio.revendaveiculos.dao.MarcaDao;
import com.diegolirio.revendaveiculos.model.Marca;

@Service("marcaService")
public class MarcaService {

	@Autowired
	private MarcaDao marcaDao;
	
	public List<Marca> getList() {
		return this.marcaDao.getList(Marca.class);
	}

	public void save(Marca marca) {
		this.marcaDao.save(marca);
	}

	public Marca get(long id) {
		return this.marcaDao.get(Marca.class, id);
	}
	
}
