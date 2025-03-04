package com.etemkeskin.cms.responses;


import com.etemkeskin.cms.entities.Blog;

import lombok.Data;

@Data
public class BlogResponse {

	Long id;
	Long userId;
	String userName;
	String title;
	String text;
	
	public BlogResponse(Blog entity) {
		this.id = entity.getId();
		this.userId = entity.getUser().getId();
		this.userName = entity.getUser().getFirstName();
		this.title = entity.getTitle();
		this.text = entity.getContent();
	}
}
