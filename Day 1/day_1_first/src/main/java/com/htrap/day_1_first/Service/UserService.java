package com.htrap.day_1_first.Service;

import com.htrap.day_1_first.Model.Model;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    Model model = new Model();

    public Model getString(){
        model.setMessage("Hello world!!");
        return model;
    }

    public Model getNameString(String name){
        model.setMessage("Hello "+name+" !!");
        return model;
    }

}
