package com.htrap.JPA2.Controller;

import com.htrap.JPA2.Model.Department;
import com.htrap.JPA2.Service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    DepartmentServiceImpl departmentService;
    @GetMapping("/")
    public String getString(){
        return "Hello World !";
    }

    //CREATE
    @PostMapping("/addData")
    public Department addData(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    //READ
    @GetMapping("/readData")
    public List<Department> readData(){
        return departmentService.fetchDepartmentList();
    }

    //UPDATE
    @PutMapping("/updateData/{id}")
    public Department updateData(@RequestBody Department department, @PathVariable("id") Long id){
        return departmentService.updateDepartment(department,id);
    }

    //DELETE
    @DeleteMapping("/deleteData/{id}")
    public String deleteData(@PathVariable("id") Long id){
        return departmentService.deleteDepartment(id);
    }
}
