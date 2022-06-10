package com.codewithdurgesh.blog.payloads;

import lombok.Data;

@Data
public class JwtAuthResponse {

	private String token;

	
	// getter and setter
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
