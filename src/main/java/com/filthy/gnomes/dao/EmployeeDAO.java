package com.filthy.gnomes.dao;

import com.filthy.gnomes.entities.Employee;
import com.filthy.gnomes.entities.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Tyzmo on 11/21/2015.
 */
public interface EmployeeDAO extends JpaRepository<Employee, Long> {

    Employee findOneById(Long id);
    Employee findOneByUsername(String username);
}
