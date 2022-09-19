package com.tarifas.rest.service;

import java.util.List;

import com.tarifas.rest.model.Precio;

public interface PreciosService {

    public List<Precio> findAll();
    
    public List<Precio> findId();

	public List<Precio>  findPrecio();
}
