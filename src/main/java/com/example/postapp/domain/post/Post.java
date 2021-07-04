package com.example.postapp.domain.post;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Post {
	private Integer id;
	private String title;
	private String content;
	private String author;
	private Date created;
}
