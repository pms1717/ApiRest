package com.tarifas.rest.service.impl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarifas.rest.model.Precio;
import com.tarifas.rest.repository.PreciosRepository;
import com.tarifas.rest.service.PreciosService;

@Service
public class PreciosServiceImpl implements PreciosService{

    @Autowired
    private PreciosRepository precioRepository;
    
    public List<Precio> findAll(){
    	List<Precio> result = precioRepository.findAll();
    	
        return result;
    }
    
    public List<Precio> findId(){
    	return precioRepository.findPrecioPorid(35455L);
    }
    
    
    public List<Precio> obtenerPrecioPorFechaCadenaYProducto(Timestamp period, Integer idProducto, Integer idCadena){
    	// > 2012-09-15 18:47:52
    	//Timestamp timestamp = java.sql.Timestamp.valueOf("2020-06-14 18:00:00");  
    	
    	//List<Precio> result = precioRepository.findPrecioPoridddd(timestamp);
    	
    	return result;
    }
    
    
    public List<Precio> findPrecio(){
    	// > 2012-09-15 18:47:52
    	Timestamp timestamp = java.sql.Timestamp.valueOf("2020-06-14 18:00:00");  
    	
    	List<Precio> result = precioRepository.findPrecioPoridddd(timestamp);
    	
    	return result;
    }
}
