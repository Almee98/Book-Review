package com.example.Book_Review.web.controller;

import com.example.Book_Review.services.RegistrationService;
import com.example.Book_Review.web.entity.User;
import com.example.Book_Review.web.exception.ResourceNotFoundException;
import com.example.Book_Review.web.model.UserModel;
import com.example.Book_Review.web.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class RegisterController {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RegistrationService registrationService;

//    @GetMapping("/")
//    public List<UserModel> getAllUsers(){
//        return userRepo.findAll();
//    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello! You are using the GET API.";
    }

    @PostMapping("/register")
    public String regisetrUser(@RequestBody UserModel userModel){

        User user = registrationService.registerUser(userModel);

        return "Success";
    }
//    @GetMapping("/{id}")
//    public ResponseEntity<UserModel> getUserById(@PathVariable long id){
//        UserModel userModel = userRepo.findById(id)
//                .orElseThrow(()-> new ResourceNotFoundException("User with id "+id+"does not exist"));
//
//        return ResponseEntity.ok().body(userModel);
//    }
//
//    @PostMapping
//    public UserModel createUser(@RequestBody UserModel userModel){
//        return userRepo.save(userModel);
//    }
}
