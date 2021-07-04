package com.example.postapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.postapp.domain.post.Post;
import com.example.postapp.repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepository;
	
	public List<Post> 모두가져오기() {
		return postRepository.list();
	}
	
	public void 저장하기(Post post) {
		postRepository.insert(post);
	}
	
	public Post 한건가져오기(int id) {
		return postRepository.findByNum(id);
	}
	
	public void 수정하기(Post post) {
		postRepository.update(post);
	}
	
	public void 삭제하기(int id) {
		postRepository.delete(id);
	}
}
