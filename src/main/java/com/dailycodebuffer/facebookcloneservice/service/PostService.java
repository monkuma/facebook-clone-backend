package com.dailycodebuffer.facebookcloneservice.service;

import java.util.List;

import com.dailycodebuffer.facebookcloneservice.model.Post;

public interface PostService {

    Post addPost(Post post) throws Exception;

    List<Post> getPost();
    
}
