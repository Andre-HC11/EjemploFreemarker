package net.javaguides.springboot.freemarker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.freemarker.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Long>{

}
