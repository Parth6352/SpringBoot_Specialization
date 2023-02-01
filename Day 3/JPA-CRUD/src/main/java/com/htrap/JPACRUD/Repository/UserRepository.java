package com.htrap.JPACRUD.Repository;

import com.htrap.JPACRUD.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Employee,Integer> {
}
