package com.jpa.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.Repository.EmployeeRepo;
import com.jpa.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
      
      @Autowired
      private EmployeeRepo employeeRepository;
      
      @Override
      public List <Employee> getAllEmployees(){
    	  return employeeRepository.findAll();
      }
      @Override
      public void saveEmployee(Employee employee) {
    	  this.employeeRepository.save(employee);
      }
      @Override
      public Employee getEmployeeById(long id) {
    	  Optional<Employee> optional=employeeRepository.findById(id);
    	  Employee employee=null;
    	  if(optional.isPresent()) {
    		  employee=optional.get();
    	  } else {
    		  throw new RuntimeException("Employee not found for id::"+id);
    	  }
    	  return employee;
      }
      @Override
      public void deleteEmployeeById(long id) {
    	  this.employeeRepository.deleteById(id);
      }
      
}
