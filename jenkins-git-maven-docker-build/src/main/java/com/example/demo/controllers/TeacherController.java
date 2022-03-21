package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class TeacherController {

	@GetMapping("/teachers")
	public String getTeachers() {
		List<String> list =Arrays.asList("Ash","San","Abd");
		return list.toString();
	}
	
	@GetMapping("/teachers/{dept}")
	public String getTeachers(@PathVariable String dept) {
		List<String> list =Arrays.asList("Ash","San","Abd");
		
		if(dept.equals("ece")) {
			list= Arrays.asList("Ashwin","Ajay","boiii");
		}
		System.out.println(list);
		return list.toString();
	}
	
	@GetMapping(path="/teachers/{id}")
	public String getTeachersById(@PathVariable("id") int id) {
		
		return "Best Teacher";
	}
	
	
}
