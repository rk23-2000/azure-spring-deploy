package com.azure.SpringAzure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringAzureController {

	@GetMapping("/message")
	public String message() {
		return "Hello!! This is Spring application deployed in Azure";
	}
}
