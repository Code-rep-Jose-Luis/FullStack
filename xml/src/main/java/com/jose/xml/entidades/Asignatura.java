package com.jose.xml.entidades;

import java.util.Objects;

public class Asignatura {

	private String id;
	private String nombre;
	private String cicloFormativo;
	private String curso;
	private String profesor;
	
	public Asignatura() {
		
	}

	public Asignatura(String id, String nombre, String cicloFormativo, String curso, String profesor) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cicloFormativo = cicloFormativo;
		this.curso = curso;
		this.profesor = profesor;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCicloFormativo() {
		return cicloFormativo;
	}

	public void setCicloFormativo(String cicloFormativo) {
		this.cicloFormativo = cicloFormativo;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	@Override
	public String toString() {
		return "Asignatura [id=" + id + ", nombre=" + nombre + ", cicloFormativo=" + cicloFormativo + ", curso=" + curso
				+ ", profesor=" + profesor + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asignatura other = (Asignatura) obj;
		return Objects.equals(id, other.id);
	}
	
}