package ru.spbu.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.spbu.project.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
