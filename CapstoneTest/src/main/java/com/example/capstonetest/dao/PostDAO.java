package com.example.capstonetest.dao;

import com.example.capstonetest.dto.PostDTO;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface PostDAO {

    @Results(id="PostResultMap", value = {
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "postName", column = "post_name"),
            @Result(property = "postBody", column = "post_body")
    })
    @SelectProvider(type = PostDAOProvider.class, method = "PostAllSearch")
    List<PostDTO> postAllSearch();
}
