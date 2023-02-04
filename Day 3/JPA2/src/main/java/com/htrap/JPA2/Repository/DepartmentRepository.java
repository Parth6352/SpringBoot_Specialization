package com.htrap.JPA2.Repository;

import com.htrap.JPA2.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,  Long> {
}
