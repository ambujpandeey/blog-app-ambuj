package com.codewithdurgesh.blog.payloads;

import lombok.Data;

@Data
public class RoleDto {
	private int id;
	private String name;

	// getter and setter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
