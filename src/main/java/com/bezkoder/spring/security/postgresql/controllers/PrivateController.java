package com.bezkoder.spring.security.postgresql.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PrivateController {

    @GetMapping("/private/text")
    public ResponseEntity<String> privateMessage(){
        return new ResponseEntity<>("Hi, this is private api for authorized", HttpStatus.OK);
    }
}
