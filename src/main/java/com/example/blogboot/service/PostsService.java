package com.example.blogboot.service;

import com.example.blogboot.domain.Posts;

import java.util.List;

public interface PostsService {
    Posts crete(Posts posts);
    Posts findById(int id);
    List<Posts> findAll();
}
