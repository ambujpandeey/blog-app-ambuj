package com.codewithdurgesh.blog.payloads;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CommentDto {

	private int id;

	private String content;

	// getter and setter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
