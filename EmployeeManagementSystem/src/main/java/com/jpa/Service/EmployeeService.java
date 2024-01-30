package com.jpa.Service;
import java.util.*;

import com.jpa.model.Employee;

public interface EmployeeService {
     List <Employee> getAllEmployees();
     void saveEmployee(Employee employee);
     Employee getEmployeeById(long id);
     void deleteEmployeeById(long id);
     }
