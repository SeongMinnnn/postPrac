package com.postprac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostRepository extends JpaRepository {

    Optional findById(Long id);
}
