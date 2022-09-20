package com.tarifas.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.tarifas.rest.model.PrecioDTO;
import com.tarifas.rest.service.impl.PreciosServiceImpl;

@ExtendWith(MockitoExtension.class)
public class PreciosControllerUnitTest {

	@Mock
	private PreciosServiceImpl preciosService;
	
	@InjectMocks
	private PreciosController preciosController;
	
	private PrecioDTO precio;
	
	@Test
	public void test_obtenerPrecio_Prueba1() {
		
		Mockito.when(this.preciosService.obtenerPrecioPorFechaCadenaYProducto(Mockito.any(), 
				Mockito.any(), Mockito.any())).thenReturn(precio);
		
		Timestamp timestamp = java.sql.Timestamp.valueOf("2020-06-14 10:00:00");  
		ResponseEntity<PrecioDTO> respuesta = this.preciosController.obtenerPrecio(timestamp, 1, 35455);
		assertEquals(HttpStatus.OK, respuesta.getStatusCode());
	    assertNotNull(respuesta.getBody());
	}
	
	
	@BeforeEach
	public void setPrecio() {	
		precio = new PrecioDTO();
		
		Timestamp startDate = java.sql.Timestamp.valueOf("2020-06-14 00:00:00");	
		Timestamp endDate = java.sql.Timestamp.valueOf("2020-06-31 23:59:59");
		
		precio.setBrandId(1);
		precio.setStartDate(startDate);
		precio.setEndDate(endDate);
		precio.setPriority(1);
		precio.setProductId(35455);
	}
}
