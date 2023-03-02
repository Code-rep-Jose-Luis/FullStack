package com.jose.json.entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class People {

	private String name;
	private String height;
	private String mass;
	private String eye_color;
	private String homeworld;
	private List<String> films;
	private String url;
	
	public People() {
		films = new ArrayList<String>();
	}

	

	public People(String name, String height, String mass, String eye_color, String homeworld, List<String> films,
			String url) {
		super();
		this.name = name;
		this.height = height;
		this.mass = mass;
		this.eye_color = eye_color;
		this.homeworld = homeworld;
		this.films = films;
		this.url = url;
	}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getMass() {
		return mass;
	}

	public void setMass(String mass) {
		this.mass = mass;
	}

	public String getEye_color() {
		return eye_color;
	}

	public void setEye_color(String eye_color) {
		this.eye_color = eye_color;
	}

	public String getHomeworld() {
		return homeworld;
	}

	public void setHomeworld(String homeworld) {
		this.homeworld = homeworld;
	}

	public List<String> getFilms() {
		return films;
	}

	public void setFilms(List<String> films) {
		this.films = films;
	}




	@Override
	public String toString() {
		return "People [name=" + name + ", height=" + height + ", mass=" + mass + ", eye_color=" + eye_color
				+ ", homeworld=" + homeworld + ", films=" + films + ", url=" + url + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(url);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		People other = (People) obj;
		return Objects.equals(url, other.url);
	}

	
	
	
	
}