package com.example.movieai.controllers;

import com.example.movieai.models.Movie;
import com.example.movieai.services.AiService;
import com.example.movieai.services.MovieService;
import org.apache.http.HttpException;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;
    private final AiService aiService;

    public MovieController(MovieService movieService, AiService aiService) {
        this.movieService = movieService;
        this.aiService = aiService;
    }

    // Add a movie

    @PostMapping("/add")
    public Movie addMovie(@RequestBody Movie userInput) throws HttpException, IOException {

        // Get the user entered data
        String title = userInput.getTitle();
        double rating = userInput.getRating();

        // Ask AI for description
        String aiDescription = aiService.generateDescription(title, rating);

        // Create a movie object combining all the columns
        Movie fullMovie = new Movie(title, rating, aiDescription);

        // Call the addMovie method in MovieService to save the new movie to the list
        movieService.addMovie(fullMovie);

        // return movie object added
        return fullMovie;
    }

    @GetMapping("/all")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

}
