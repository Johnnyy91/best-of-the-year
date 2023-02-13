package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Movie;
import com.example.demo.model.Song;

import java.util.ArrayList;
import java.util.List;



@Controller
@RequestMapping("/")
public class TestController {
	
	@GetMapping()
	public String home(Model model) {
		model.addAttribute("name" , "Claudio");
		return "index";
	}
	
	

	@GetMapping("/movie")
	public String movie(Model model) {
		List<Movie> movie = getBestMovie();
		model.addAttribute("movie", movie);
		return "movie";
	}


	@GetMapping("/song")
	public String song(Model model) {
		List<Song> song = getBestSong();
		model.addAttribute("song", song);
		return "song";
	}
	

	
	private List<Movie> getBestMovie(){

		List<Movie> movie = new ArrayList<>();
		
	
		Movie movie1 = new Movie("The Dark Knight", 1);
		movie.add(movie1);


		Movie movie2 = new Movie("The Lord of the Rings", 2);
		movie.add(movie2);
		
		return movie;
		
	}
	
	

	private List<Song> getBestSong(){

		List<Song> song = new ArrayList<>();
		
		
		Song song1 = new Song("Il mio canto libero", 1);
		song.add(song1);

	
		Song song2 = new Song("A real Hero", 2);
		song.add(song2);
		
		return song;
		
	}
	
	
}
