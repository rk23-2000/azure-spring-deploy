package com.azure.SpringAzure;

import java.io.IOException;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SpringAzureController {
	
	@Autowired
	private AuthorService authorService;

	@GetMapping("/message")
	public String message() {
		return "Hello!! This is Spring application deployed in Azure";
	}
	@GetMapping("/authors")
	public String getAuthors() throws URISyntaxException, IOException, InterruptedException {
		String response = authorService.getAuthorDetails();
		return response;
	}
}
