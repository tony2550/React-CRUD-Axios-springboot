package com.example.postapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.postapp.domain.post.Post;
import com.example.postapp.dto.CMRespDto;
import com.example.postapp.dto.post.PostReqDto;
import com.example.postapp.repository.PostRepository;
import com.example.postapp.service.PostService;

@RestController
public class PostController {
	
	@Autowired
	private PostService postService;
	
	@CrossOrigin
	@GetMapping("/post")
	public List<Post> 모두가져오기() {
		List<Post> posts = postService.모두가져오기();
		return  posts;
	}
	
	@CrossOrigin
	@PostMapping("/post")
	public ResponseEntity<?> 저장하기(@RequestBody Post post) {
		System.out.println("post() 실행됨");
		postService.저장하기(post);
		return new ResponseEntity<>(new CMRespDto<>(1,"post success",null),HttpStatus.OK);
	}
	
	@CrossOrigin
	@GetMapping("/post/{id}")
	public ResponseEntity<?> 한건가져오기(@PathVariable int id) {
		System.out.println("findByNum 실행");
		Post post = postService.한건가져오기(id);
		return new ResponseEntity<>(new CMRespDto<>(1,"get success",post),HttpStatus.OK);
	}
	
	@CrossOrigin
	@PutMapping("/post/{id}")
	public ResponseEntity<?> 수정하기(@PathVariable int id, @RequestBody Post post) {
		postService.수정하기(post);
		return new ResponseEntity<>(new CMRespDto<>(1,"update success",post),HttpStatus.OK);
	}
	
	@CrossOrigin
	@DeleteMapping("/post/{id}")
	public ResponseEntity<?> 삭제하기(@PathVariable int id) {
		postService.삭제하기(id);
		// CMRespDto data -> null // 리액트에서 데이터를 가져올 필요가 없기때문
		return new ResponseEntity<>(new CMRespDto<>(1,"delete success",null),HttpStatus.OK);
	}
}
