package com.example.capstonetest.dao;

import org.apache.ibatis.jdbc.SQL;

public class PostDAOProvider {

    public String postAllSearch() {
        SQL sql = new SQL();

        sql.SELECT("id")
                .SELECT("postName")
                .SELECT("postBody");

        return sql.toString();
    }
}
