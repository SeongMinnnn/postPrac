package com.postprac.service;

import com.postprac.dto.PostRequestDto;
import com.postprac.dto.PostResponseDto;
import com.postprac.entity.Post;
import com.postprac.repository.PostRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Getter
@Service
@RequiredArgsConstructor
public class PostService {
    private final Post post;
    private final PostRepository postRepository;
    public PostResponseDto create(PostRequestDto requestDto) {
        postRepository.save(requestDto);
        return new PostResponseDto(requestDto);
    }

    public PostResponseDto read(Long id) {
        Post post = postRepository.findById(id).orElseThrow(
                -> new IllegalArgumentException()
        );
        return new PostResponseDto(post);
    }

    public PostResponseDto update(PostRequestDto requestDto) {
        post.update(requestDto);
        return new PostResponseDto(requestDto);
    }

    public String delete(Long id) {
        postRepository.delete(id);
        return "삭제완료";
    }
}
