package com.example.demo.homeserviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.HomeRepository;
import com.example.demo.service.HomeService;

@Service
public class HomeServiceImple implements HomeService {
	
	@Autowired
	HomeRepository hr;
	@Override
	public void saveData(Student s) {
     hr.save(s);		
	}

}
