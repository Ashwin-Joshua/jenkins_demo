package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
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
	
}
