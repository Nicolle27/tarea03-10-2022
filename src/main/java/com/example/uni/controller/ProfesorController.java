package com.example.uni.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.uni.services.ProfesorService;

@RestController
@RequestMapping("/api/profesor")
@CrossOrigin({"*"})
public class ProfesorController {
	
	@Autowired
	private ProfesorService ProfesorService;
	
	@GetMapping("/all")
	public List<Map<String, Object>> readAll2(){		
		return ProfesorService.readAll2();
	}
	

}
