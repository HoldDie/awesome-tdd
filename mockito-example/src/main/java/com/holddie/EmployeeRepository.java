package com.holddie;

import java.util.List;

public interface EmployeeRepository {

    List<Employee> findAll();

    Employee save(Employee e);
}
