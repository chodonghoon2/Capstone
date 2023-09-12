package com.example.capstonetest.dto;

public class PostDTO {

    private Long id;
    private String PostName;
    private String PostBody;

    public PostDTO() {
    }

    public PostDTO(Long id, String postName, String postBody) {
        this.id = id;
        PostName = postName;
        PostBody = postBody;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPostName() {
        return PostName;
    }

    public void setPostName(String postName) {
        PostName = postName;
    }

    public String getPostBody() {
        return PostBody;
    }

    public void setPostBody(String postBody) {
        PostBody = postBody;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", PostName='" + PostName + '\'' +
                ", PostBody='" + PostBody + '\'' +
                '}';
    }
}
