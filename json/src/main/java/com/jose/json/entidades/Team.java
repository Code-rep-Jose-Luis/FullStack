package com.jose.json.entidades;

import java.util.Objects;

public class Team {
	
	private int id;
	private String name;
	private String shortName;
	
	public Team() {
		
	}

	public Team(int id, String name, String shortName) {
		super();
		this.id = id;
		this.name = name;
		this.shortName = shortName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", shortName=" + shortName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, shortName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Team other = (Team) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(shortName, other.shortName);
	}
	
	

}