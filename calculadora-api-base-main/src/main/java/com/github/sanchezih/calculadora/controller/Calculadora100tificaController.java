package com.github.sanchezih.calculadora.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/100tifica")
public class Calculadora100tificaController {
	
	public Calculadora100tificaController() {
	}
	@RequestMapping(value = "/cuadrado", method = RequestMethod.GET, params = {"num1"})
	public Integer cuadrado(@RequestParam("num1") Integer num1) {
		return (num1 * num1);
	}
	@RequestMapping(value = "/factorial", method = RequestMethod.GET, params = {"num1"})
	public Integer factorial(@RequestParam("num1") Integer num1) {
		Integer resultado = 1;
		for(int i = 1; i <= num1; i++) {
	        resultado *= i;	          	       
	    }
		return resultado;
	}
	@RequestMapping(value = "/esPrimo", method = RequestMethod.GET, params = {"num1"})
	public String esPrimo(@RequestParam("num1") Integer num1) {
		String resultado = "Es primo";
		for(int i = 2; i < num1; i++) {
	        if (num1 % i == 0) {
	            resultado = "No es primo";
	            break;
	        }
	    }
		return resultado;
	}
}
