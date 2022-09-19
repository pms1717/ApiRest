package com.tarifas.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "precios")
public class Precio {

    @Column(name = "brand_id")
    private Long brandId;
    
    @Column(name = "start_date")
    private Timestamp startDate;
    
    @Column(name = "end_date")
    private Timestamp endDate;
    
    @Column(name = "price_list")
    private Integer priceList;
    
    @Id
    @Column(name = "product_id")
    private Long id;
    
    @Column(name = "priority")
    private Integer priority;
    
    @Column(name = "price")
    private Double price;
    
    @Column(name = "curr")
    private String curr;
    
 
    

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the startDate
     */
    public Timestamp getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public Timestamp getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the priceList
     */
    public Integer getPriceList() {
        return priceList;
    }

    /**
     * @param priceList the priceList to set
     */
    public void setPriceList(Integer priceList) {
        this.priceList = priceList;
    }

    /**
     * @return the priority
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * @param priority the priority to set
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return the curr
     */
    public String getCurr() {
        return curr;
    }

    /**
     * @param curr the curr to set
     */
    public void setCurr(String curr) {
        this.curr = curr;
    }

    /**
     * @return the brandId
     */
    public Long getBrandId() {
        return brandId;
    }

    /**
     * @param brandId the brandId to set
     */
    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }
    
    
    
}
