package com.htrap.day_1_second.Controller;

import com.htrap.day_1_second.Model.UserModel;
import com.htrap.day_1_second.Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    UserService userService = new UserService();
    UserModel userModel = new UserModel();
    @GetMapping("/calculate/{number1}/{symbol}/{number2}")
    public ResponseEntity<UserModel> calulate(@PathVariable Integer number1, @PathVariable Character symbol, @PathVariable Integer number2){
        userModel = userService.calculate(number1, symbol, number2);
        return new ResponseEntity<>(userModel, HttpStatus.ACCEPTED);
    }

    @GetMapping("/calculate")
    public ResponseEntity<UserModel> calculateParam(@RequestParam("number1") Integer number1,
                                                    @RequestParam("symbol") Character symbol,
                                                    @RequestParam("number2") Integer number2){
        userModel = userService.calculate(number1, symbol, number2);
        return new ResponseEntity<>(userModel, HttpStatus.ACCEPTED);
    }
}
