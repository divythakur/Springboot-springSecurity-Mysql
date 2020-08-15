package com.example.jwt.demo.jwt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
    @GetMapping("/")
    public String all(){
        return ("welcome all");
    }
    @GetMapping("/user")
    public String user(){
        return ("welcome user");
    }
    @GetMapping("/admin")
    public String admin(){
        return ("welcome admin");
    }



}
