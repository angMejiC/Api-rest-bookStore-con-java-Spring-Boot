package com.BookStore.BookStore.Services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookStore.BookStore.Model.employee;
import com.BookStore.BookStore.Repository.employeeRepository;

@Service
public class employeeService {

    @Autowired
    private employeeRepository employeeRepository;

    public List<employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public employee saveEmployee(employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}

