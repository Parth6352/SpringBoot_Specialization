package com.htrap.day_2_first.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    Long id;
    String fname;
    String lname;
    String email;
    String password;
    Long enroll;

}
