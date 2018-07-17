package com.madcrow.gun_class.Entities.ItemEntities;



import javax.persistence.*;

@Entity
public class Item {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(fetch = FetchType.EAGER)
    private ItemModel itemModel;

    @OneToOne(fetch = FetchType.EAGER)
    private ItemDescription itemDescription;

    private Double askingPrice;

    private boolean active;

    public Item(ItemModel itemModel, ItemDescription itemDescription, Double askingPrice, boolean active) {
        this.itemModel = itemModel;
        this.itemDescription = itemDescription;
        this.askingPrice = askingPrice;
        this.active = active;
    }

    public ItemDescription getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(ItemDescription itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Double getAskingPrice() {
        return askingPrice;
    }

    public void setAskingPrice(Double askingPrice) {
        this.askingPrice = askingPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ItemModel getItemModel() {
        return itemModel;
    }

    public void setItemModel(ItemModel itemModel) {
        this.itemModel = itemModel;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
