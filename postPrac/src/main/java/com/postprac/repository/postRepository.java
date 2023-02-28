package com.postprac.repository;

import com.postprac.entity.Post;

public interface PostRepository {

    Post findById(Long id);
}
