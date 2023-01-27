package com.htrap.day_1_second.Service;

import com.htrap.day_1_second.Model.UserModel;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserModel userModel = new UserModel();
    Integer answer = 0;

    public UserModel calculate(Integer number1, Character symbol, Integer number2) {
        switch (symbol) {
            case '+' -> answer = number1 + number2;
            case '-' -> answer = number1 - number2;
            case '*' -> answer = number1 * number2;
            case '/' -> answer = number1 / number2;
            case '^' -> answer = number1 ^ number2;
            case '%' -> answer = number1 % number2;
            default -> answer = 0;
        }
        if (answer == 0) {
            userModel.setAnswer("Invalid choice!");
        } else {
            userModel.setAnswer(answer.toString());
        }

        return userModel;
    }
}
