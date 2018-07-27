package com.lizi.bbs.domain;

import java.util.Date;
import java.util.Objects;

public class Post {
    private int postId; // 帖子ID
    private int userId; // 作者ID
    private String postTitle; // 帖子标题
    private String postContent; // 帖子内容
    private Date createTime; // 帖子创建时间
    private Date updateTime; // 帖子更新时间
    private int likeCount; // 点赞数
    private int commentCount; // 评论数
    private int postViewCount; // 阅读量

    public Post() {
    }

    public Post(int postId, int userId, String postTitle, String postContent, Date createTime, Date updateTime, int likeCount, int commentCount, int postViewCount) {
        this.postId = postId;
        this.userId = userId;
        this.postTitle = postTitle;
        this.postContent = postContent;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.likeCount = likeCount;
        this.commentCount = commentCount;
        this.postViewCount = postViewCount;
    }

    public int getPostId() {

        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public int getPostViewCount() {
        return postViewCount;
    }

    public void setPostViewCount(int postViewCount) {
        this.postViewCount = postViewCount;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return postId == post.postId &&
                userId == post.userId &&
                likeCount == post.likeCount &&
                commentCount == post.commentCount &&
                postViewCount == post.postViewCount &&
                Objects.equals(postTitle, post.postTitle) &&
                Objects.equals(postContent, post.postContent) &&
                Objects.equals(createTime, post.createTime) &&
                Objects.equals(updateTime, post.updateTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(postId, userId, postTitle, postContent, createTime, updateTime, likeCount, commentCount, postViewCount);
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", userId=" + userId +
                ", postTitle='" + postTitle + '\'' +
                ", postContent='" + postContent + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", likeCount=" + likeCount +
                ", commentCount=" + commentCount +
                ", postViewCount=" + postViewCount +
                '}';
    }
}
