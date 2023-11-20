package org.example.repository;

import org.example.model.employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<employee, Long> {
// all crud database methods
}
