package com.tarifas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tarifas.model.Precio;
import com.tarifas.repository.PreciosRepository;
import com.tarifas.service.PreciosService;

public class PreciosServiceImpl implements PreciosService{

    @Autowired
    private PreciosRepository precioRepository;
    
    public List<Precio> findAll(){
        return precioRepository.findAll();
    }
}
