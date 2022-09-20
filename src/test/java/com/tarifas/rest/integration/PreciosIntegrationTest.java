package com.tarifas.rest.integration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLException;
import java.sql.Timestamp;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.datasource.init.ScriptException;
import org.springframework.web.util.UriComponentsBuilder;

import com.tarifas.rest.model.PrecioDTO;

 
public class PreciosIntegrationTest extends BaseIntegrationTest{

	
	@Test
	public void obtenerPrecio_Prueba1() {
		  String url = "http://localhost:" + port;
	      String testUrl = url + "/precios/obtenerPrecio";
	      
	      Timestamp fechaAplicacion = java.sql.Timestamp.valueOf("2020-06-14 10:00:00");  
	      Integer idProducto = 35455;
	      Integer idCadena = 1;
	    		  
	      UriComponentsBuilder ucb = UriComponentsBuilder.fromHttpUrl(testUrl)
	                .queryParam("fechaAplicacion", fechaAplicacion)
	                .queryParam("idProducto", idProducto)
	                .queryParam("idCadena", idCadena);
	      
	      final ResponseEntity<PrecioDTO> response = 
	    		   this.restTemplate.getForEntity(ucb.toUriString(), PrecioDTO.class);
	      
	      assertEquals(HttpStatus.OK, response.getStatusCode());
	      assertEquals(1L, response.getBody().getId());
	            
	}
	
	@Test
	public void obtenerPrecio_Prueba2() {
		  String url = "http://localhost:" + port;
	      String testUrl = url + "/precios/obtenerPrecio";
	      
	      Timestamp fechaAplicacion = java.sql.Timestamp.valueOf("2020-06-14 16:00:00");  
	      Integer idProducto = 35455;
	      Integer idCadena = 1;
	    		  
	      UriComponentsBuilder ucb = UriComponentsBuilder.fromHttpUrl(testUrl)
	                .queryParam("fechaAplicacion", fechaAplicacion)
	                .queryParam("idProducto", idProducto)
	                .queryParam("idCadena", idCadena);
	      
	      final ResponseEntity<PrecioDTO> response = 
	    		   this.restTemplate.getForEntity(ucb.toUriString(), PrecioDTO.class);
	      
	      assertEquals(HttpStatus.OK, response.getStatusCode());
	      assertEquals(2L, response.getBody().getId());
	            
	}
	
	@Test
	public void obtenerPrecio_Prueba3() {
		  String url = "http://localhost:" + port;
	      String testUrl = url + "/precios/obtenerPrecio";
	      
	      Timestamp fechaAplicacion = java.sql.Timestamp.valueOf("2020-06-14 21:00:00");  
	      Integer idProducto = 35455;
	      Integer idCadena = 1;
	    		  
	      UriComponentsBuilder ucb = UriComponentsBuilder.fromHttpUrl(testUrl)
	                .queryParam("fechaAplicacion", fechaAplicacion)
	                .queryParam("idProducto", idProducto)
	                .queryParam("idCadena", idCadena);
	      
	      final ResponseEntity<PrecioDTO> response = 
	    		   this.restTemplate.getForEntity(ucb.toUriString(), PrecioDTO.class);
	      
	      assertEquals(HttpStatus.OK, response.getStatusCode());
	      assertEquals(1L, response.getBody().getId());
	            
	}
	
	@Test
	public void obtenerPrecio_Prueba4() {
		  String url = "http://localhost:" + port;
	      String testUrl = url + "/precios/obtenerPrecio";
	      
	      Timestamp fechaAplicacion = java.sql.Timestamp.valueOf("2020-06-15 10:00:00");  
	      Integer idProducto = 35455;
	      Integer idCadena = 1;
	    		  
	      UriComponentsBuilder ucb = UriComponentsBuilder.fromHttpUrl(testUrl)
	                .queryParam("fechaAplicacion", fechaAplicacion)
	                .queryParam("idProducto", idProducto)
	                .queryParam("idCadena", idCadena);
	      
	      final ResponseEntity<PrecioDTO> response = 
	    		   this.restTemplate.getForEntity(ucb.toUriString(), PrecioDTO.class);
	      
	      assertEquals(HttpStatus.OK, response.getStatusCode());
	      assertEquals(4L, response.getBody().getId());
	            
	}
	
	@Test
	public void obtenerPrecio_Prueba5() {
		  String url = "http://localhost:" + port;
	      String testUrl = url + "/precios/obtenerPrecio";
	      
	      Timestamp fechaAplicacion = java.sql.Timestamp.valueOf("2020-06-16 21:00:00");  
	      Integer idProducto = 35455;
	      Integer idCadena = 1;
	    		  
	      UriComponentsBuilder ucb = UriComponentsBuilder.fromHttpUrl(testUrl)
	                .queryParam("fechaAplicacion", fechaAplicacion)
	                .queryParam("idProducto", idProducto)
	                .queryParam("idCadena", idCadena);
	      
	      final ResponseEntity<PrecioDTO> response = 
	    		   this.restTemplate.getForEntity(ucb.toUriString(), PrecioDTO.class);
	      
	      assertEquals(HttpStatus.OK, response.getStatusCode());
	      assertEquals(5L, response.getBody().getId());
	            
	}
	
	
	@Test
	public void obtenerPrecio() throws ScriptException, SQLException {
		
		  String url = "http://localhost:" + port;
	      String testUrl = url + "/precios/findId";
	       
	      Integer idProducto = 1;
	    		  
	      UriComponentsBuilder ucb = UriComponentsBuilder.fromHttpUrl(testUrl)
	                .queryParam("idProducto", idProducto);
	      
	      final ResponseEntity<PrecioDTO> response = 
	    		   this.restTemplate.getForEntity(ucb.toUriString(), PrecioDTO.class);
	      
	      assertEquals(HttpStatus.OK, response.getStatusCode());
	      
	      
	}
}
