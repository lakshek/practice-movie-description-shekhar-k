package com.example.movieai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

import org.apache.http.HttpException;
import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class MovieaiApplication {

	public static void main(String[] args) throws HttpException, IOException {

        SpringApplication.run(MovieaiApplication.class, args);

	}

}
