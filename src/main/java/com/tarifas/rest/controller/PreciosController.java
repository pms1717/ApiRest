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
    
    
//    @GetMapping("/findAll")
//    public ResponseEntity<List<Precio>> obtenerTarifa(@RequestParam @DateTimeFormat(pattern = "dd/MM/yyyy") final Date fechaAplicacion,
//            @RequestParam final Integer idProducto, @RequestParam final Integer idCadena){
//
//        return new ResponseEntity<>(preciosService.findAll(), HttpStatus.OK);
//    }
    
    @GetMapping("/findAll")
    public ResponseEntity<List<PrecioDTO>> obtenerTarifa(){
        return new ResponseEntity<>(preciosService.findAll(), HttpStatus.OK);
    }
    
//    @GetMapping("/findID")
//    public ResponseEntity<List<Precio>> obtenerPrecio(){
//        return new ResponseEntity<>(preciosService.findId(), HttpStatus.OK);
//    }
    
    /**
 * Obtener precio.
 *
 * @param period the period
 * @param idProducto the id producto
 * @param idCadena the id cadena
 * @return the response entity
 */
@GetMapping("/obtenerPrecio")
    public ResponseEntity<PrecioDTO> obtenerPrecio(@RequestParam(value = "fechaAplicacion") Timestamp period,
    		@RequestParam(value = "idProducto") Integer idProducto, @RequestParam(value = "idCadena") Integer idCadena){
        return new ResponseEntity<>(preciosService.obtenerPrecioPorFechaCadenaYProducto(period,idProducto,idCadena), HttpStatus.OK);
    }
    
    
//    @GetMapping("/findPrecio")
//    public ResponseEntity<List<Precio>> obtenerPrecio2(){
//        return new ResponseEntity<>(preciosService.findPrecio(), HttpStatus.OK);
//    }
}
