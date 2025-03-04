package com.etemkeskin.cms.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.etemkeskin.cms.responses.BlogResponse;
import com.etemkeskin.cms.services.BlogService;

@RestController
@RequestMapping("/blogs")
public class BlogController {

	private BlogService blogService;
	
	public BlogController(BlogService blogService) {
		this.blogService = blogService;
	}
	
	@GetMapping
	public List<BlogResponse> getAllBlogs(@RequestParam Optional<Long> userId) {
		return blogService.getAllBlogs(userId);
	}
	
}
