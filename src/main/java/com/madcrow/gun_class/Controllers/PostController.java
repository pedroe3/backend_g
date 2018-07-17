package com.madcrow.gun_class.Controllers;

import com.madcrow.gun_class.Entities.PostEntities.Post;
import com.madcrow.gun_class.Entities.PostEntities.PostDTO;
import com.madcrow.gun_class.Entities.PostEntities.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class PostController {

    @Autowired
    private PostRepository service;

    @PostMapping("/posts")
    public ResponseEntity<Object> createPost(@Valid @RequestBody Post post)
    {
        Post savedPost = service.save(post);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedPost.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping("/posts/{id}")
    public Optional<Post> searchPost(@PathVariable Long id)
    {
        Optional<Post> post = service.findById(id);


        //URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(post.get().getId()).toUri();
        return post;
    }

    @GetMapping("/posts")
    public PostDTO getAllPost()
    {
        List<Post> post = service.findAll();

        PostDTO postDTO = new PostDTO(post);
        return postDTO;
    }
}
