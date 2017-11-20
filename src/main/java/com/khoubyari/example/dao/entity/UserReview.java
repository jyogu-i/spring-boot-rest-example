package com.khoubyari.example.dao.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "User_review")
public class UserReview {

    /** */
    @Column(name = "review_id")
    Integer reviewId;

    /** */
    @Id
    @Column(name = "user_id")
    String userId;

    /** */
    @Column(name = "ca_id")
    String caId;

    @Column(name = "interview")
    int interview;

    @Column(name = "selection")
    int selection;

    @Column(name = "review_company")
    int reviewCompany;

    @Column(name = "synthesis")
    int synthesis;

    @Column(name = "review_message")
    String reviewMessage;


    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCaId() {
        return caId;
    }

    public void setCaId(String caId) {
        this.userId = caId;
    }

    public int getInterview() {
        return interview;
    }

    public void setInterview(int interview) {
        this.interview = interview;
    }

    public int getReviewCompany() {
        return reviewCompany;
    }

    public void setReviewCompany(int reviewCompany) {
        this.reviewCompany = reviewCompany;
    }

    public int getSynthesis() {
        return synthesis;
    }

    public void setSynthesis(int synthesis) {
        this.synthesis = synthesis;
    }

    public String getReviewMessage() {
        return reviewMessage;
    }

    public void setReviewMessage(String reviewMessage) {
        this.reviewMessage = reviewMessage;
    }

    public int getSelection() {
        return selection;
    }

    public void setSelection(int selection) {
        this.selection = selection;
    }
}