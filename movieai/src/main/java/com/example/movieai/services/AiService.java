package com.example.movieai.services;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import org.apache.http.HttpException;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class AiService {

    Client client = new Client();

    public String generateDescription(String title, double rating) throws HttpException, IOException {

        // Create the prompt
        String prompt = String.format(
                "Write a 2 sentence, movie description for a movie titled '%s' with a rating of '%.1f' out of 10.", title, rating
        );

        // Call Gemini
        GenerateContentResponse response = client.models.generateContent("gemini-2.0-flash-001", prompt, null);

        return response.text();
    }

}
