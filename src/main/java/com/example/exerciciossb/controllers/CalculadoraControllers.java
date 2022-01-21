package com.example.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.exerciciossb.models.Calculadora;

@RestController
@RequestMapping(path = "/calculadora")
public class CalculadoraControllers {
	// /calculadora/somar/10/20
	// /calculadora/subtrair?a=100&b=20
	
	@GetMapping("somar/{a}/{b}")
	public int somar (@PathVariable int a, @PathVariable int b) {
		Calculadora result = new Calculadora(a, b, a + b);
		return result.getC();
	}
	
	@GetMapping("/subtrair")
	public int subtrair(
			@RequestParam(name = "a") int a, 
			@RequestParam(name = "b") int b) {
		Calculadora result = new Calculadora(a, b, a - b);
		return result.getC();
	}
	
}
