package com.htrap.JPA2.Service;

import com.htrap.JPA2.Model.Department;

import java.util.List;

public interface DepartmentService {

    //Create
    Department saveDepartment(Department department);

    //READ
    List<Department> fetchDepartmentList();

    //UPDATE
    Department updateDepartment(Department department, Long departmentId);

    //DELETE
    String deleteDepartment(Long departmentId);
}
