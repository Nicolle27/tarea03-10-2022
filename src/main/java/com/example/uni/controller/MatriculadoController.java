package com.example.uni.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.uni.services.MatriculadoService;

@RestController

@RequestMapping("/api/alumno")
@CrossOrigin({"*"})
public class MatriculadoController {
	
	
	@Autowired
	private MatriculadoService MatriculadoService;
	
	@GetMapping("/all3")
	public List<Map<String, Object>> readAll(){		
		return MatriculadoService.readAll();
	}
	
	@GetMapping("/all")
	public List<Map<String, Object>> readAll2(){		
		return MatriculadoService.readAll2();
	}
	
	@GetMapping("/all2")
	public List<Map<String, Object>> readAll3(){		
		return MatriculadoService.readAll3();
	}
	
	
	
	
	
	
}
