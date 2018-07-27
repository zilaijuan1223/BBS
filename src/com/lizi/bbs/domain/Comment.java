package com.lizi.bbs.domain;

import java.util.Date;
import java.util.Objects;

public class Comment {
    private int commentId; // 评论ID
    private int userId; // 用户ID
    private int postId; // 帖子ID
    private String commentContent; // 评论内容
    private Date commentTime; // 评论时间

    public Comment() {
    }

    public Comment(int commentId, int userId, int postId, String commentContent, Date commentTime) {
        this.commentId = commentId;
        this.userId = userId;
        this.postId = postId;
        this.commentContent = commentContent;
        this.commentTime = commentTime;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return commentId == comment.commentId &&
                userId == comment.userId &&
                postId == comment.postId &&
                Objects.equals(commentContent, comment.commentContent) &&
                Objects.equals(commentTime, comment.commentTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(commentId, userId, postId, commentContent, commentTime);
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", userId=" + userId +
                ", postId=" + postId +
                ", commentContent='" + commentContent + '\'' +
                ", commentTime=" + commentTime +
                '}';
    }
}
