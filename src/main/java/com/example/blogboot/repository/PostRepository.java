package com.example.blogboot.repository;

import com.example.blogboot.domain.Author;
import com.example.blogboot.domain.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostRepository extends JpaRepository<Posts, Integer> {

}
