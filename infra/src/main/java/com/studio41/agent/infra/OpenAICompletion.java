package com.studio41.agent.infra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

public class OpenAICompletion {

    public static OpenAICompletionResponse chatGPT(OpenAICompletionRequestBody requestBody) {
        String url = "https://api.openai.com/v1/chat/completions";
        String apiKey = System.getenv("OPENAI_API_KEY");

        try {
            URL obj = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Authorization", "Bearer " + apiKey);
            connection.setRequestProperty("Content-Type", "application/json");

            ObjectMapper objectMapper = new ObjectMapper();
            String body = objectMapper.writeValueAsString(requestBody);
            connection.setDoOutput(true);
            OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
            writer.write(body);
            writer.flush();
            writer.close();
 
            // Response from ChatGPT
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
 
            StringBuffer response = new StringBuffer();
 
            while ((line = br.readLine()) != null) {
                response.append(line);
            }
            br.close();
 
            return objectMapper.readValue(response.toString(), OpenAICompletionResponse.class);
 
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
 
 }