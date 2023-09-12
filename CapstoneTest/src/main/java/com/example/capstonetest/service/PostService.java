package com.example.capstonetest.service;

import com.example.capstonetest.dao.PostDAO;
import com.example.capstonetest.dto.PostDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.example.capstonetest.common.jdbc.JDBCTemplate.getSqlSession;

public class PostService {

    private PostDAO postDAO;

    public List<PostDTO> postAllSearch() {

        SqlSession sqlSession = getSqlSession();

        postDAO = sqlSession.getMapper(PostDAO.class);

        List<PostDTO> postList = postDAO.postAllSearch();

        sqlSession.close();

        return postList;
    }
}
