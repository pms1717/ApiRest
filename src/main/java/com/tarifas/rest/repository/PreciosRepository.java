package com.tarifas.rest.repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tarifas.rest.entity.Precio;

@Repository
public interface PreciosRepository extends JpaRepository<Precio, Long> {
	
	/**
	 * Find precio por fecha producto cadena.
	 *
	 * @param date the date
	 * @param idProducto the id producto
	 * @param idCadena the id cadena
	 * @return the list
	 */
	@Query("SELECT precio FROM Precio precio "
			+ "WHERE precio.startDate < :date "
			+ "AND precio.endDate >= :date "
			+ "AND precio.productId = :idProducto "
			+ "AND precio.brandId = :idCadena")
	List<Precio> findPrecioPorFechaProductoCadena(Timestamp date, Integer idProducto, Integer idCadena);
}
