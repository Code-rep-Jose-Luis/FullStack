package com.jose.springboot.backend.eventos.models.dto;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.jose.springboot.backend.eventos.models.entity.Usuario;

public class EventoDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String nombre;
	private String descripcion;
	private Set<Usuario> usuarios = new HashSet<Usuario>(0);
	
	public EventoDto() {
		
	}

	public EventoDto(int id, String nombre, String descripcion, Set<Usuario> usuarios) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.usuarios = usuarios;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	

}