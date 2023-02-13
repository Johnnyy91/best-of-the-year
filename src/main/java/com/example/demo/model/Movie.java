package com.example.demo.model;


public class Movie {

		String title;
		int id;
	
		
		public Movie(String title, int id) {
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
			return "Movie [title=" + title + "]";
		}

}