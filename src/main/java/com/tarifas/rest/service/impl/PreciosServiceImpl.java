package com.tarifas.rest.service.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.tarifas.rest.entity.Precio;
import com.tarifas.rest.model.PrecioDTO;
import com.tarifas.rest.repository.PreciosRepository;
import com.tarifas.rest.service.PreciosService;

@Service
public class PreciosServiceImpl implements PreciosService{

    @Autowired
    private PreciosRepository precioRepository;
    
    
    /**
     * Obtener precio por fecha cadena Y producto.
     *
     * @param period the period
     * @param idProducto the id producto
     * @param idCadena the id cadena
     * @return the precio DTO
     */
    public PrecioDTO obtenerPrecioPorFechaCadenaYProducto(Timestamp period, Integer idProducto, Integer idCadena){ 
    	
    	List<Precio> result = precioRepository.findPrecioPorFechaProductoCadena(period, idProducto, idCadena);
    	
    	List<PrecioDTO> listaDTO = new ArrayList<PrecioDTO>(0);
    	
    	PrecioDTO precio = null;
    	
    	if(!CollectionUtils.isEmpty(result)) {
    		
    		for(Precio p : result) {	
    			listaDTO.add(new PrecioDTO(p));
    		}
    		
    		List<PrecioDTO> listaFiltrada = listaDTO.stream().filter(Objects::nonNull).filter(p-> Objects.nonNull(p.getPriority())).collect(Collectors.toList());
    		
    		Comparator<PrecioDTO> comparator = Comparator.comparing(PrecioDTO::getPriority);	
    		
    		if(!CollectionUtils.isEmpty(listaFiltrada)) {
    			precio = listaFiltrada.stream().max(comparator).get();
    		}
    		

    	}
    	
    	return precio;
    }
    

}
