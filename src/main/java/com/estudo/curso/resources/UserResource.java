package com.estudo.curso.resources;

import com.estudo.curso.entitites.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User("123",1L,"andre","andre@gmail","1234");
        return ResponseEntity.ok().body(u);
    }
}
