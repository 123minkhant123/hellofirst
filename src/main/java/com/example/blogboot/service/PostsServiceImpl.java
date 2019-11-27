package com.example.blogboot.service;

import com.example.blogboot.domain.Posts;
import com.example.blogboot.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostsServiceImpl implements  PostsService {

    private final  PostRepository postRepository;

    public PostsServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Posts crete(Posts posts) {
        return postRepository.save(posts);
    }

    @Override
    public Posts findById(int id) {
        return postRepository.findById(id).orElse(null);
    }

    @Override
    public List<Posts> findAll() {
        return postRepository.findAll();
    }
}
