package com.etemkeskin.cms.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.etemkeskin.cms.entities.Blog;
import com.etemkeskin.cms.repos.BlogRepository;
import com.etemkeskin.cms.responses.BlogResponse;



@Service
public class BlogService {
	
	private BlogRepository blogRepository;


	public BlogService(BlogRepository blogRepository) {
		this.blogRepository = blogRepository;
	}

	public List<BlogResponse> getAllBlogs(Optional<Long> userId) {
		List<Blog> list;
		if (userId.isPresent()) {
			list = blogRepository.findByUserId(userId.get());
		} else {
			list = blogRepository.findAll();
		}
		
		return list.stream().map(p -> new BlogResponse(p)).collect(Collectors.toList());
	}


}






