package com.yashaswini.NewsApp;

import java.io.Serializable;

public class Model implements Serializable {
    private String title;
    private  String imageurl;
    private  String Author;
    private String Content;

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    private int image;

    public Model(String title,String imageurl) {
        this.title = title;
        this.imageurl = imageurl;
    }

    public String getTitle() {
        return title;
    }


    public String getImageUrl() {
        return imageurl;
    }
}
