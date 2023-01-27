package com.htrap.day_1_first.Controller;

import com.htrap.day_1_first.Model.Model;
import com.htrap.day_1_first.Service.UserService;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    UserService userService = new UserService();
    Model model = new Model();
    @RequestMapping("/")
    public ResponseEntity<Model> getString(){
        model.setMessage("localhost:8080/getString | localhost:8080/getString/{String value}");
        return new ResponseEntity<Model>(model,HttpStatus.ACCEPTED);
    }

    @GetMapping("/getString")
    public ResponseEntity<Model> getMessage(){
        model = userService.getString();
        return new ResponseEntity<>(model,HttpStatus.ACCEPTED);
    }

    @GetMapping("/getString/{message}")
    public ResponseEntity<Model> getUserMessage(@PathVariable String message){
        model = userService.getNameString(message);
        return new ResponseEntity<>(model,HttpStatus.ACCEPTED);
    }

    @GetMapping("/getString1")
    public ResponseEntity<Model> getUserReqMessage(@RequestParam("message") String message){
        model = userService.getNameString(message);
        return new ResponseEntity<>(model,HttpStatus.ACCEPTED);
    }
}