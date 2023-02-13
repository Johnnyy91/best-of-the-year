package com.example.demo.model;

public class Song {
	
	private String title;
	private int id;
	
	
	public Song(String title, int id) {
		super();
		this.title = title;
		this.id = id;
	}
	

	
   public String getTitle() {
		return title;
	}

	public int getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Song [title=" + title + "]"; 
	}
	
}