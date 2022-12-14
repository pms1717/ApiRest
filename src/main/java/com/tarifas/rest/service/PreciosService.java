package com.tarifas.rest.service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import com.tarifas.rest.entity.Precio;
import com.tarifas.rest.model.PrecioDTO;

public interface PreciosService {

	/**
	 * Obtener precio por fecha cadena Y producto.
	 *
	 * @param period the period
	 * @param idProducto the id producto
	 * @param idCadena the id cadena
	 * @return the precio DTO
	 */
	public PrecioDTO obtenerPrecioPorFechaCadenaYProducto(Timestamp period, Integer idProducto, Integer idCadena);
}
