package com.socialpetwork.comment;

import jakarta.persistence.*;

import java.security.Timestamp;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id; // Primary Key

    @Column(name = "userId", nullable = false)
    private Long userId;

    @Column(name = "header", nullable = false)
    private String header;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "postedAt", nullable = false)
    private Timestamp postedAt;

    @Column(name = "postId", nullable = false)
    private Long postId;

    // Constructor
    public Comment (){
    }

    // Parameterized Constructor
    public Comment (Long userId, String header, String content, Timestamp postedAt, Long postId){
        this.userId = userId;
        this.header = header;
        this.content = content;
        this.postedAt = postedAt;
        this.postId = postId;
    }

    // Getters and Setters
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getUserId(){
        return userId;
    }

    public void setUserId(Long userId){
        this.userId = userId;
    }

    public String getHeader(){
        return header;
    }

    public void setHeader(String header){
        this.header = header;

    }

    public String getContent(){
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getPostedAt(){
        return postedAt;
    }

    public void setPostedAt(Timestamp postedAt){
        this.postedAt = postedAt;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }




}
