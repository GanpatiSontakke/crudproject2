package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Student;

public interface HomeRepository extends CrudRepository<Student, Integer> {


}
