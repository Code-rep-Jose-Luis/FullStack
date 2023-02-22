package com.jose.xml.entidades;

import java.time.LocalDate;

public class NoticiasCine {
	
	String category;
	String title;
	String link;
	String description;
	String guid;
	String author;
	LocalDate pubDate;
	
	
	
	public NoticiasCine() {
		
	}


	public NoticiasCine(String category, String title, String link, String description, String guid,String author, LocalDate pubDate) {
		super();
		this.category = category;
		this.title = title;
		this.link = link;
		this.description = description;
		this.guid = guid;
		this.author=author;
		this.pubDate = pubDate;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getLink() {
		return link;
	}


	public void setLink(String link) {
		this.link = link;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getGuid() {
		return guid;
	}


	public void setGuid(String guid) {
		this.guid = guid;
	}


	public LocalDate getPubDate() {
		return pubDate;
	}


	public void setPubDate(LocalDate pubDate) {
		this.pubDate = pubDate;
	}


	@Override
	public String toString() {
		return "NoticiasCine [category=" + category + ", title=" + title + ", link=" + link + ", description="
				+ description + ", guid=" + guid + ", author=" + author + ", pubDate=" + pubDate + "]";
	}


	
	
	
}
