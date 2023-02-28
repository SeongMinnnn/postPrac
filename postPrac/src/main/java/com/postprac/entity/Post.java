package com.postprac.entity;

import com.postprac.dto.PostRequestDto;
import com.postprac.dto.PostResponseDto;
import lombok.Getter;

@Getter
public class Post {
    private String username;
    private String title;
    private String content;

    public Post(PostRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.title = requestDto.getTitle();
        this.content = requestDto.getContent();
    }
    public void update(PostRequestDto requestDto){
        this.username = requestDto.getUsername();
        this.title = requestDto.getTitle();
        this.content = requestDto.getContent();
    }
}
