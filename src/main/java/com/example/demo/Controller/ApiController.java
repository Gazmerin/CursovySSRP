package com.example.demo.Controller;

import com.example.demo.Models.Dostup;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {
    @GetMapping(value = "/")
    public String getPages(){
        return "Добро пожаловать в ад!";
    }
    @GetMapping(value = "/dostup")
    public String setDostup(){
        setEditDostup(2);
        return "Доступ выдан";
    }
}
