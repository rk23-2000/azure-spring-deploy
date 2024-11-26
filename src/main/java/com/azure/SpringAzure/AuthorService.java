package com.azure.SpringAzure;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.stereotype.Service;

@Service
public class AuthorService {

	private String endpoint="https://fakerestapi.azurewebsites.net/api/v1/Authors";

	public String getAuthorDetails() throws URISyntaxException, IOException, InterruptedException {
		String response = null;

		HttpRequest httpRequest = HttpRequest.newBuilder()
				                             .uri(new URI(endpoint))
				                             .version(HttpClient.Version.HTTP_2)
				                             .GET()
				                             .build();

		HttpResponse<String> httpResponse = HttpClient.newBuilder()
				                                      .build()
				                                      .send(httpRequest, HttpResponse.BodyHandlers.ofString());
		
		System.out.println(httpResponse.statusCode());
		return httpResponse.body();
	}
}
