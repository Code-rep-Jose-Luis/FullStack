package com.jose.xml.entidades;

public class NoticiaMundo {

	private String title;
	private String description;
	private String creator;
	private String category;
	private String guid;
	private String pubDate;
	
	public NoticiaMundo() {
		
	}

	public NoticiaMundo(String title, String description, String creator, String category, String guid,
			String pubDate) {
		super();
		this.title = title;
		this.description = description;
		this.creator = creator;
		this.category = category;
		this.guid = guid;
		this.pubDate = pubDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	@Override
	public String toString() {
		return "NoticiaMundo [title=" + title + ", description=" + description + ", creator=" + creator + ", category="
				+ category + ", guid=" + guid + ", pubDate=" + pubDate + "]";
	}
	
	
	
}
