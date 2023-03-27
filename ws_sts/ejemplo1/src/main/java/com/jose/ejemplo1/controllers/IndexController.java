package com.jose.ejemplo1.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jose.ejemplo1.entidades.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {

	@GetMapping({"/index","/","","/home"})
	public String index(Model model) {
		model.addAttribute("titulo","programa de java");
		return"index";
	}
	
	/*@GetMapping({"/index","/","","/home"})
	public String index(Map<String,Object> map) {
		map.put("titulo", "programa de prueba");
		map.put("contenidoh1", "Contenido del H1");
		return "index";

	}*/
	@GetMapping("/perfil")
	public String perfil(Model model) {
		model.addAttribute("titulo","Perfil del usuario");
		model.addAttribute("usuario",new Usuario("Jose","Romero","jromero@gmail.com"));
		return"perfil";
	}
	@GetMapping("/listar")
	public String listar(Model model) {
		
		model.addAttribute("titulo","Perfil del usuario");
		//model.addAttribute("usuarios",poblarUsuarios()); //ModelAttribue sustituye esta linea para todas sus versiones
		return "listar";
	}
	
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios(){
		List<Usuario> usuarios=new ArrayList<Usuario>();
		usuarios.add(new Usuario("Jose","Romero","jromero@gmail.com"));
		usuarios.add(new Usuario("Luis","Romero","jromero@gmail.com"));
		usuarios.add(new Usuario("Gallego","Romero","jromero@gmail.com"));
		return usuarios;
	}
}
