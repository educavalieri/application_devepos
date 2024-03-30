package com.application_dev.application_dev.controller;

import com.application_dev.application_dev.dtos.UsersDTO;
import com.application_dev.application_dev.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/id/{id}")
    public ResponseEntity<UsersDTO> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok().body(userService.findById(id));
    }
    @GetMapping(value = "/email/{email}")
    public ResponseEntity<UsersDTO> findByEmail(@PathVariable("email") String email){
        return ResponseEntity.ok().body(userService.findByEmail(email));
    }

    @PostMapping
    public ResponseEntity<UsersDTO> save(@RequestBody UsersDTO usersDTO) {
        return ResponseEntity.ok().body(userService.save(usersDTO));
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity delete(@PathVariable("id") Long id){
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<UsersDTO>> findAll(){
        return ResponseEntity.ok().body(userService.findAll());
    }





}
