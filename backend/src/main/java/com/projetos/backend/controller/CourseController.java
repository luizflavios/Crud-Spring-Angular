package com.projetos.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetos.backend.model.Course;
import com.projetos.backend.repository.CourseRepository;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
	
	@Autowired
	private CourseRepository courseRepository;
	
	@GetMapping(value = "/findAll")
	public List<Course> findAll(){
		List<Course> cursos = (List<Course>) courseRepository.findAll();
		return cursos; 
	}
	
}
