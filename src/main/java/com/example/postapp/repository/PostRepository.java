package com.example.postapp.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.postapp.domain.post.Post;
import com.example.postapp.domain.post.PostMapper;
import com.example.postapp.dto.post.PostReqDto;

@Repository
public class PostRepository {
	
	@Autowired
	private PostMapper postMapper;
	
	public List<Post> list() {
		return postMapper.list();
	}
	
	public void insert(Post post) {
		postMapper.insert(post);
	}
	
	public Post findByNum(int id) {
		return postMapper.findByNum(id);
	}
	
	public void update(Post post) {
		postMapper.update(post);
	}
	
	public void delete(int id) {
		postMapper.delete(id);
	}
	
}
