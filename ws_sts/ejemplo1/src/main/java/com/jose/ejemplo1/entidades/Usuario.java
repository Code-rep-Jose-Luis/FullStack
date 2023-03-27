package com.jose.ejemplo1.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
	
	private String nombre;
	private String apellidos;
	private String email;
	

}
