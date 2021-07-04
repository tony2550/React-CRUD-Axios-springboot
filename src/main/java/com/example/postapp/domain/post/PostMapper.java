package com.example.postapp.domain.post;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostMapper {
	
	public List<Post> list(); //전체보기
	public void insert(Post post); //추가
	public Post findByNum(int id); //상세보기
	public void update(Post post); // 수정
	public void delete(int id); // 삭제
}
