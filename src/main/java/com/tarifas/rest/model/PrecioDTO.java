package com.tarifas.rest.model;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tarifas.rest.entity.Precio;

public class PrecioDTO {

	@JsonIgnore
	private Long id;
	
    private Integer brandId;
    
    private Timestamp startDate;
    
    private Timestamp endDate;
    
    private Integer productId;
   
    private Double price;
    
    @JsonIgnore
    private Integer priority;

	public PrecioDTO(Precio p) {
		super();
		this.id = p.getId();
		this.brandId = p.getBrandId();
		this.startDate = p.getStartDate();
		this.endDate = p.getEndDate();
		this.productId = p.getProductId();
		this.price = p.getPrice();
		this.priority = p.getPriority();
	}

	public PrecioDTO() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public Timestamp getStartDate() {
		return startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public Timestamp getEndDate() {
		return endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}
    
	
    
    
}
