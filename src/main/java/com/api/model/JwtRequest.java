package com.api.model;

import java.io.Serializable;

public class JwtRequest implements Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6840916617590555305L;
	private String username;
	private String password;
	private String api;
	
	public String getApi() {
		return api;
	}

	public void setApi(String api) {
		this.api = api;
	}

	//need default constructor for JSON Parsing
	public JwtRequest()
	{
		
	}

	public JwtRequest(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
