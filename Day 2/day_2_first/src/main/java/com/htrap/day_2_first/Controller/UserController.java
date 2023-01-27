package com.htrap.day_2_first.Controller;

import com.htrap.day_2_first.DTO.UserDTO;
import com.htrap.day_2_first.Service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class UserController {

    UserService userService = new UserService();
    @GetMapping("/showData")
    public ArrayList<UserDTO> showData(){
        return userService.readData();
    }
}
