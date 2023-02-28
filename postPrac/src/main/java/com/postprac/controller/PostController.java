package com.postprac.controller;

import com.postprac.dto.PostRequestDto;
import com.postprac.dto.PostResponseDto;
import com.postprac.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class PostController {
    private final PostService postService;

    @PostMapping("/post")
    public PostResponseDto create(@RequestBody PostRequestDto requestDto){
        return postService.create(requestDto);
    }

    @GetMapping("/post")
    public PostResponseDto read(@PathVariable Long id){
        return postService.read(id);
    }

    @PutMapping("/post")
    public PostResponseDto update(@RequestBody PostRequestDto requestDto){
        return postService.update(requestDto);
    }

    @GetMapping("/post")
    public String delete(@PathVariable Long id){
        return postService.delete(id);
    }
}
