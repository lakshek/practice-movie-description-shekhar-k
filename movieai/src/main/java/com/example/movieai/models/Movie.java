package com.example.movieai.models;

public class Movie {

    private String title;
    private double rating;
    private String aiDescription;

    public Movie(String title, double rating, String aiDescription) {
        this.title = title;
        this.rating = rating;
        this.aiDescription = aiDescription;
    }

    public String getTitle() {
        return this.title;
    }

    public double getRating() {
        return this.rating;
    }

    public String getAiDescription() {
        return this.aiDescription;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setAiDescription(String aiDescription) {
        this.aiDescription = aiDescription;
    }
}
