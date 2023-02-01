package com.htrap.day_2_first.Controller;

import com.htrap.day_2_first.DTO.UserDTO;
import com.htrap.day_2_first.Model.UserModel;
import com.htrap.day_2_first.Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UserController {

    UserService userService = new UserService();
    UserDTO userDTO = new UserDTO();
    @GetMapping("/showData")
    public ResponseEntity<ArrayList<UserDTO>> showData(){
        ArrayList<UserDTO> list = userService.readData();
        return new ResponseEntity<>(list, HttpStatus.ACCEPTED);
    }
    @GetMapping("/showData/{id}")
    public ResponseEntity<UserDTO> showPerticularData(@PathVariable Integer id){
        userDTO = userService.readPerticularData(id);
        return new ResponseEntity<>(userDTO,HttpStatus.ACCEPTED);
    }

    @PostMapping("/addData")
    public ResponseEntity<UserDTO> addData(@RequestBody UserModel userModel){
        userDTO = userService.addData(userModel);
        return new ResponseEntity<>(userDTO,HttpStatus.ACCEPTED);
    }
}
