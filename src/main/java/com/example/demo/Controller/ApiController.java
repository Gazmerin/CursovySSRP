package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {
    @GetMapping(value = "/")
    public String getPages(){
        return "Добро пожаловать в ад!";
    }
}
