package com.madcrow.gun_class.Entities.ItemEntities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ItemDescription {

    @Id
    @GeneratedValue
    private Long id;

    private String description;

    private String caliber;

    private int capacity;

    private String finishDescription;

    private String manufacturingPartNumber;

    private String upc;

    private Long barrelLenght;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCaliber() {
        return caliber;
    }

    public void setCaliber(String caliber) {
        this.caliber = caliber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getFinishDescription() {
        return finishDescription;
    }

    public void setFinishDescription(String finishDescription) {
        this.finishDescription = finishDescription;
    }

    public String getManufacturingPartNumber() {
        return manufacturingPartNumber;
    }

    public void setManufacturingPartNumber(String manufacturingPartNumber) {
        this.manufacturingPartNumber = manufacturingPartNumber;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public Long getBarrelLenght() {
        return barrelLenght;
    }

    public void setBarrelLenght(Long barrelLenght) {
        this.barrelLenght = barrelLenght;
    }
}
