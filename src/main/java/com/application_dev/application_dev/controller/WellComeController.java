package com.application_dev.application_dev.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/wellcome")
public class WellComeController {

    @GetMapping
    public String welcome(){
        return "well come young Padawan";
    }

    @GetMapping
    @RequestMapping(value = "/hello")
    public String hello(){
        return "Hello my friend";
    }

    @GetMapping
    @RequestMapping(value = "/oi")
    public String oi(){
        return "oi meu amigo";
    }
    
    @GetMapping
    @RequestMapping(value = "/teste")
    public String teste(){
        return "teste ok";
    }

}
