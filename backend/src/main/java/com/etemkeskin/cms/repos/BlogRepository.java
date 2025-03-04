package com.etemkeskin.cms.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etemkeskin.cms.entities.Blog;


public interface BlogRepository extends JpaRepository<Blog, Long> {

	// JPA handle this method
	List<Blog> findByUserId(Long userId);

}
