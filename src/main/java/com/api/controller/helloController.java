package com.api.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.api.model.JwtRequest;
import com.api.model.JwtResponse;

@RestController
@CrossOrigin
public class helloController {

	
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<JwtRequest> request = new HttpEntity<>(authenticationRequest);
		HttpEntity<JwtResponse>  response = restTemplate
		  .exchange("http://localhost:8080/authenticate", HttpMethod.POST, request, JwtResponse.class);
		
		 response =restTemplate.postForEntity("http://localhost:8080/authenticate", request, JwtResponse.class);
		
		return ResponseEntity.ok(response.getBody());
	}
	
	
}
