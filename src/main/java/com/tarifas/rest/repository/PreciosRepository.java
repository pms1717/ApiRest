package com.tarifas.rest.repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tarifas.rest.entity.Precio;

@Repository
public interface PreciosRepository extends JpaRepository<Precio, Long> {

	@Query("SELECT precio FROM Precio precio "
			+ "WHERE precio.productId= ?1")
	
	List<Precio> findPrecioPorid(Long id);
	
	
	@Query("SELECT precio FROM Precio precio "
			+ "WHERE precio.startDate < ?1 "
			+ "AND precio.endDate >= ?1")
	List<Precio> findPrecioPoridddd(Timestamp date);
	
	@Query("SELECT precio FROM Precio precio "
			+ "WHERE precio.startDate < :date "
			+ "AND precio.endDate >= :date "
			+ "AND precio.productId = :idProducto "
			+ "AND precio.brandId = :idCadena")
	List<Precio> findPrecioPorFechaProductoCadena(Timestamp date, Integer idProducto, Integer idCadena);
}
