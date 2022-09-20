package com.tarifas.rest.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tarifas.rest.entity.Precio;
import com.tarifas.rest.model.PrecioDTO;
import com.tarifas.rest.service.PreciosService;

@RestController
@RequestMapping("/precios")
public class PreciosController {

    @Autowired
    private PreciosService preciosService;
    
    
    /**
 * 
 * Obtiene el precio de un producto según su fecha de aplicación, identificador de producto e identificador de cadena
 *
 * @param period the period
 * @param idProducto the id producto
 * @param idCadena the id cadena
 * @return the response entity
 */
@GetMapping("/obtenerPrecio")
    public ResponseEntity<PrecioDTO> obtenerPrecio(@RequestParam(value = "fechaAplicacion") Timestamp fechaAplicacion,
    		@RequestParam(value = "idProducto") Integer idProducto, @RequestParam(value = "idCadena") Integer idCadena){
        return new ResponseEntity<>(preciosService.obtenerPrecioPorFechaCadenaYProducto(fechaAplicacion,idProducto,idCadena), HttpStatus.OK);
    }
    
}
