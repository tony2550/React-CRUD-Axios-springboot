package com.example.postapp.dto.post;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PostReqDto {
	private String title;
	private String content;
	private String author;
	private Date created;
}
