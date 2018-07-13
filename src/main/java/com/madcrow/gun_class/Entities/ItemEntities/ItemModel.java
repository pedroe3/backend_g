package com.madcrow.gun_class.Entities.ItemEntities;


import javax.persistence.*;

@Entity
public class ItemModel {

    @Id
    @GeneratedValue
    private Long id;

    private String ItemModel;

    @ManyToOne(fetch = FetchType.EAGER)
    private ItemManufacturer itemManufacturer;

    private boolean active;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemModel() {
        return ItemModel;
    }

    public void setItemModel(String itemModel) {
        ItemModel = itemModel;
    }

    public ItemManufacturer getItemManufacturer() {
        return itemManufacturer;
    }

    public void setItemManufacturer(ItemManufacturer itemManufacturer) {
        this.itemManufacturer = itemManufacturer;
    }


    public void setActive(boolean active) {
        this.active = active;
    }
}
