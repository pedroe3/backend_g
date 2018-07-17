package com.madcrow.gun_class.Entities.UserEntities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.madcrow.gun_class.Entities.PostEntities.Post;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "user_data")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Size(min=6, max=20, message = "user name is between 2 and 20")
    @Column(unique = true)
    private String userName;

    @Size(min=2, max=20, message="profile name is between 2 and 20")
    private String profileName;

    @Size(min = 2, max = 50, message = "Name hast at least two characters and max of 50")
    private String firstName;

    @Size(max = 50, message = "last name has a maximum of 50 character")
    private String lastName;

    @Email
    @Size(max = 100, message = "email has a maximum of 100 characters")
    @Column(unique = true)
    private String email;

    @Size(max = 100, message = "mobile number has a maximum of 100 characters")
    private String mobileNumber;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Post> posts;

    @OneToMany(mappedBy = "user")
    private List<UserImage> photos;

    private boolean active;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    protected User(){}

    public User(String firstName, String lastName, String email, String mobileNumber) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public List<UserImage> getPhotos() {
        return photos;
    }

    public void setPhotos(List<UserImage> photos) {
        this.photos = photos;
    }

    public List<Post> getPosts() {
        return posts;
    }


    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
