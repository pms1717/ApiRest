package com.tarifas.rest.service;

import java.sql.Timestamp;
import java.util.List;

import com.tarifas.rest.model.Precio;

public interface PreciosService {

    public List<Precio> findAll();
    
    public List<Precio> findId();

	public List<Precio>  findPrecio();

	public List<Precio> obtenerPrecioPorFechaCadenaYProducto(Timestamp period, Integer idProducto, Integer idCadena);
}
