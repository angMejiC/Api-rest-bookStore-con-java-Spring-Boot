package com.BookStore.BookStore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BookStore.BookStore.Model.employee;

@Repository
public interface employeeRepository extends JpaRepository<employee, Long> {
}