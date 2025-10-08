package com.example.movieai.services;

import com.example.movieai.models.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    private final List<Movie> movies = new ArrayList<>();

    // Service to add a movie
    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    // Service to get the list of movies
    public List<Movie> getAllMovies() {
        return movies;
    }
}
