package com.dailycodebuffer.facebookcloneservice.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.facebookcloneservice.model.Post;
import com.dailycodebuffer.facebookcloneservice.service.PostService;

@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/post")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public Post addPost(@RequestParam Map<String, String> requestParam) throws Exception {
        String strPost = requestParam.get("post");
        String email = requestParam.get("email");
        String name = requestParam.get("name");
        String file = requestParam.get("file");
        String profilePic = requestParam.get("profilePic");

        Post post = Post.builder()
                .file(file).name(name).email(email).post(strPost).profilePic(profilePic)
                .timeStamp(new Date().toString())
                .build();

        post = postService.addPost(post);
        return post;
    }

    @GetMapping
    public List<Post> getPosts() {
        return postService.getPost();
    }
}
