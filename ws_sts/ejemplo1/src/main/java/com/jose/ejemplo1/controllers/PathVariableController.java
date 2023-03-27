package com.jose.ejemplo1.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class PathVariableController {

	
	@GetMapping({"/index","/","","/home"}) // http://localhost:8080/variables/index, http://localhost:8080/variables/
	public String index(Map<String,Object> map) {
		map.put("titulo", "Ejemplo Variables");
		map.put("contenidoh1", "Contenido del H1 en variables");
		return "variables/index";
	}
	
	@GetMapping("/string/{texto}") // http://localhost:8080/variables/string/3
	public String ver(@PathVariable String texto,Map<String,Object> map) {
		map.put("titulo", "Ejemplo Variables");
		map.put("contenidoh1", "Contenido del Path Variable: " + texto);
		return "variables/ver";
	}
	
	@GetMapping("/string/{texto}/{numero}") // http://localhost:8080/variables/string/hola/3
	public String ver(@PathVariable String texto, @PathVariable Integer numero,Map<String,Object> map) {
		map.put("titulo", "Ejemplo Variables");
		map.put("contenidoh1", "Contenido del Path Variable: " + texto + " y tiene el valor: " + numero);
		return "variables/ver";
	}
	
}
