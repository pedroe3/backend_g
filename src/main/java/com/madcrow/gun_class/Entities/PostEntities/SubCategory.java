package com.madcrow.gun_class.Entities.PostEntities;

import javax.persistence.*;

@Entity
public class SubCategory {

    @Id
    @GeneratedValue
    private Long id;

    private String subCategory;

    private boolean active;

    @ManyToOne(fetch = FetchType.EAGER)
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }


    public void setActive(boolean active) {
        this.active = active;
    }
}
