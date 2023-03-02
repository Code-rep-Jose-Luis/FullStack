package com.jose.json.entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Films {
	
	private String title;
	private int episode_id;
	private String opening_crawl;
	private String director;
	private String producer;
	private List<String> characters;
	private String url;
	
	public Films() {
		characters = new ArrayList<String>();
	}

	public Films(String title, int episode_id, String opening_crawl, String director, String producer,
			List<String> characters, String url) {
		super();
		this.title = title;
		this.episode_id = episode_id;
		this.opening_crawl = opening_crawl;
		this.director = director;
		this.producer = producer;
		this.characters = characters;
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getEpisode_id() {
		return episode_id;
	}

	public void setEpisode_id(int episode_id) {
		this.episode_id = episode_id;
	}

	public String getOpening_crawl() {
		return opening_crawl;
	}

	public void setOpening_crawl(String opening_crawl) {
		this.opening_crawl = opening_crawl;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public List<String> getCharacters() {
		return characters;
	}

	public void setCharacters(List<String> characters) {
		this.characters = characters;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Films [title=" + title + ", episode_id=" + episode_id + ", opening_crawl=" + opening_crawl
				+ ", director=" + director + ", producer=" + producer + ", characters=" + characters + ", url=" + url
				+ "]";
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
		Films other = (Films) obj;
		return Objects.equals(url, other.url);
	}
	
}
