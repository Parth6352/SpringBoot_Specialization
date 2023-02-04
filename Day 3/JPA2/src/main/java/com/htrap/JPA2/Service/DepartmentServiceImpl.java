package com.htrap.JPA2.Service;


import com.htrap.JPA2.Model.Department;
import com.htrap.JPA2.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    //CREATE
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    //READ
    @Override
    public List<Department> fetchDepartmentList() {
        return (List<Department>) departmentRepository.findAll();
    }

    //UPDATE
    @Override
    public Department updateDepartment(Department department, Long departmentId) {
        Department depDB = departmentRepository.findById(departmentId).get();

        if(Objects.nonNull(department.getDepartmentName())
            && !"".equalsIgnoreCase(
                    department.getDepartmentName()
        )){
            depDB.setDepartmentName(department.getDepartmentName());
        }

        if(Objects.nonNull(department.getDepartmentAddress())
            && !"".equalsIgnoreCase(
                    department.getDepartmentAddress()
        )){
            depDB.setDepartmentId(department.getDepartmentId());
        }

        if(Objects.nonNull(department.getDepartmentCode())
            && !"".equalsIgnoreCase(
                    department.getDepartmentCode()
        )){
            depDB.setDepartmentCode(department.getDepartmentCode());
        }

        return departmentRepository.save(depDB);
    }

    //DELETE
    @Override
    public String deleteDepartment(Long departmentId) {
        departmentRepository.deleteById(departmentId);
        return "Deleted "+departmentId+" record";
    }
}
