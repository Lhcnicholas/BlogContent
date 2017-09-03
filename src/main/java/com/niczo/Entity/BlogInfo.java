package com.niczo.Entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Des:
 * Author:LiNic
 * Date:2017/9/2
 */
public class BlogInfo {

    private Integer id;
    private String title;
    private String author;
    private String blogContent;
    private Integer blogType;
    private Integer blogTag;
    private Integer readAmount;
    @DateTimeFormat(pattern = "yyyy-MM")
    private Date month;
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent;
    }

    public Integer getBlogType() {
        return blogType;
    }

    public void setBlogType(Integer blogType) {
        this.blogType = blogType;
    }

    public Integer getBlogTag() {
        return blogTag;
    }

    public void setBlogTag(Integer blogTag) {
        this.blogTag = blogTag;
    }

    public Integer getReadAmount() {
        return readAmount;
    }

    public void setReadAmount(Integer readAmount) {
        this.readAmount = readAmount;
    }

    public Date getMonth() {
        return month;
    }

    public void setMonth(Date month) {
        this.month = month;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
