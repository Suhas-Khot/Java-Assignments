package com.psl.assignments.collection;

import java.util.Date;

public class Movies implements Comparable<Movies>{
	private String name, language,director, producer;
	private int duration;
	private Date releaseDate;
	public Movies(String name, String language, Date releaseDate, String director, String producer, int duration) {
		super();
		this.name = name;
		this.language = language;
		this.releaseDate = releaseDate;
		this.director = director;
		this.producer = producer;
		this.duration = duration;
	}

	public Movies() {
		// TODO Auto-generated constructor stub
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(java.util.Date date) {
		this.releaseDate = (Date) date;
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

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Movies [name=" + name + ", language=" + language + ", director=" + director + ", producer=" + producer
				+ ", duration=" + duration + ", releaseDate=" + releaseDate + "]";
	}

	@Override
	public int compareTo(Movies o) {
		// TODO Auto-generated method stub
		return this.language.compareTo(o.language);
	}
	

}
