package com.madcrow.gun_class.Entities.PostEntities;



import java.util.List;

public class PostDTO {

    private List<Post> posts;

    private int count;


    public PostDTO() {}

    public PostDTO(List<Post> posts)
    {
        this.posts = posts;
        this.count = posts.size();
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
