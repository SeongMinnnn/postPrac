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
        postRepository.create(requestDto);
        return PostResponseDto(requestDto);
    }

    public PostResponseDto read(Long id) {
        Post post = postRepository.findById(id);
        return PostResponseDto(post);
    }

    public PostResponseDto update(PostRequestDto requestDto) {
        post.update(requestDto);
        return PostResponseDto(requestDto);
    }

    public ResponseDto<String> delete(Long id) {
        postRepository.delete(id);
        return new ResponseDto(200,"삭제완료");
    }
}
