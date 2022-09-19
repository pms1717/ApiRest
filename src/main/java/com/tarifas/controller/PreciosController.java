package com.tarifas.controller;

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

import com.tarifas.model.Precio;
import com.tarifas.service.PreciosService;

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
    public ResponseEntity<List<Precio>> obtenerTarifa(){
        return new ResponseEntity<>(preciosService.findAll(), HttpStatus.OK);
    }
}
