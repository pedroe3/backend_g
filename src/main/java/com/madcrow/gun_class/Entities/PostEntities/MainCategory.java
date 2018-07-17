package com.madcrow.gun_class.Entities.PostEntities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class MainCategory {

    @Id
    @GeneratedValue
    private Long id;

    private String category;

    private boolean active;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public void setActive(boolean active) {
        this.active = active;
    }
}
