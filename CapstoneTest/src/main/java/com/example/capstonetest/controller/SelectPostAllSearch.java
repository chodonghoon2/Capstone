package com.example.capstonetest.controller;

import com.example.capstonetest.dto.PostDTO;
import com.example.capstonetest.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller("/postList")
public class SelectPostAllSearch {

    @PostMapping("postList")
    public String PostAllSearch() {

        PostService postService = new PostService();
        List<PostDTO> postList = postService.postAllSearch();


    }
}
