package com.madcrow.gun_class.Controllers;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import com.madcrow.gun_class.CustomExceptions.UserNotFoundException;
import com.madcrow.gun_class.Entities.PostEntities.Post;
import com.madcrow.gun_class.Entities.UserEntities.User;
import com.madcrow.gun_class.Entities.UserEntities.UserImage;
import com.madcrow.gun_class.Entities.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private MessageSource messageSource;

    @Autowired
    private UserRepository service;

    @GetMapping("/users")
    public List<User> getAllUsers()
    {
        List<User> users = service.findAll();
        return users;
    }

    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@Valid @RequestBody User user)
    {
        User savedUser = service.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
        return ResponseEntity.created(location).build();
    }


    @GetMapping("/users/{id}")
    public Resource<User> getUser(@PathVariable Long id)
    {
        Optional<User> user = service.findById(id);

        if(!user.isPresent())
        {
            throw new UserNotFoundException("id - " + id);
        }

        Resource<User> resource = new Resource<User>(user.get());

        ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()).getUserPosts(user.get().getId()));

        ControllerLinkBuilder linkToPhoto = linkTo(methodOn(this.getClass()).getUserPhotos(user.get().getId()));

        resource.add(linkTo.withRel("posts"));
        resource.add(linkToPhoto.withRel("photos"));

        return resource;
    }

    @GetMapping("/users/{id}/posts")
    public List<Post> getUserPosts(@PathVariable Long id)
    {
        Optional<User> user = service.findById(id);
        if(!user.isPresent())
        {
            throw new UserNotFoundException("id - " + id);
        }
        return user.get().getPosts();
    }

    @GetMapping("/users/{id}/photos")
    public List<UserImage> getUserPhotos(@PathVariable Long id)
    {
        Optional<User> user = service.findById(id);
        if(!user.isPresent())
        {
            throw new UserNotFoundException("id - " + id);
        }
        return user.get().getPhotos();
    }

    @GetMapping("/test-locale")
    public String messageLocation()
    {
        return messageSource.getMessage("good.morning.message",null, LocaleContextHolder.getLocale());
    }




}
