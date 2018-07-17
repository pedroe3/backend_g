package com.madcrow.gun_class.Entities.DataTransferObjects;



import com.madcrow.gun_class.CustomExceptions.PostNotFoundException;
import com.madcrow.gun_class.CustomExceptions.UserNotFoundException;
import com.madcrow.gun_class.Entities.PostEntities.Post;

import java.util.List;
import java.util.Optional;

public class PostDTO {

    private List<Post> posts;

    private int count;

    public PostDTO() {}

    public PostDTO(List<Post> posts)
    {
        this.posts = posts;
        this.count = posts.size();
    }

    public PostDTO(Optional<Post> post)
    {
        if(!post.isPresent())
        {
            throw new PostNotFoundException("Post Not Found.");
        }

        this.posts.add(post.get());
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
