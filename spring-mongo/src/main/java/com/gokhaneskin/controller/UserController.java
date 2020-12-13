package com.gokhaneskin.controller;

import com.gokhaneskin.entity.User;
import com.gokhaneskin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void init(){
        User user=new User();
        user.setName("Gokhan");
        user.setSurname("Eskin");
        userRepository.save(user);
    }

    @PostMapping
    public ResponseEntity<User> add(@RequestBody User user){
        return ResponseEntity.ok(userRepository.save(user));
    }

    @GetMapping
    public ResponseEntity<List< User>> getAll(){
        return ResponseEntity.ok(userRepository.findAll());
    }

}
