package com.postprac.dto;

import com.postprac.entity.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostResponseDto {
    private String username;
    private String title;
    private String content;

    public PostResponseDto(PostRequestDto requestDto){
        this.username = requestDto.getUsername();
        this.title = requestDto.getTitle();
        this.content = requestDto.getContent();
    }
    public PostResponseDto(Post post){
        this.username = post.getUsername();
        this.title = post.getTitle();
        this.content= post.getContent();
    }
}
