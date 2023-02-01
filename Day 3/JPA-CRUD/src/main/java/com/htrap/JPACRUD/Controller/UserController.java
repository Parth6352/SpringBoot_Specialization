package com.htrap.JPACRUD.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/")
    public String getAllData(){
        return "Hello World!!";
    }
}
