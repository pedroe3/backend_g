package com.madcrow.gun_class.Entities.PostEntities;

import com.madcrow.gun_class.Entities.ItemEntities.Item;
import com.madcrow.gun_class.Entities.UserEntities.User;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Post {

    @Id
    @GeneratedValue
    private Long id;

    private String subject;

    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    private Item item;

    @ManyToOne(fetch = FetchType.EAGER)
    private MainCategory mainCategory;

    @ManyToOne(fetch = FetchType.EAGER)
    private SubCategory subCategory;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @OneToMany(mappedBy = "post")
    private List<PostImage> postImages;

    private double latitude;

    private double longitude;

    @CreatedDate
    private Date createdDate;

    public Post() {}

    public Post(String subject, String description, Item item, MainCategory mainCategory, SubCategory subCategory, User user, List<PostImage> postImages, double latitude, double longitude, Date createdDate) {
        this.subject = subject;
        this.description = description;
        this.item = item;
        this.mainCategory = mainCategory;
        this.subCategory = subCategory;
        this.user = user;
        this.postImages = postImages;
        this.latitude = latitude;
        this.longitude = longitude;
        this.createdDate = createdDate;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public MainCategory getMainCategory() {
        return mainCategory;
    }

    public void setMainCategory(MainCategory mainCategory) {
        this.mainCategory = mainCategory;
    }

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<PostImage> getPostImages() {
        return postImages;
    }

    public void setPostImages(List<PostImage> postImages) {
        this.postImages = postImages;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
