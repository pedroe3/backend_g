package com.madcrow.gun_class.Entities.ItemEntities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ItemManufacturer {

    @Id
    @GeneratedValue
    private Long id;

    private String itemManufacturer;

    private boolean active;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemManufacturer() {
        return itemManufacturer;
    }

    public void setItemManufacturer(String itemManufacturer) {
        this.itemManufacturer = itemManufacturer;
    }


    public void setActive(boolean active) {
        this.active = active;
    }
}
