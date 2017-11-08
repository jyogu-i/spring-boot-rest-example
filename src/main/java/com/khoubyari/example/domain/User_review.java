package com.khoubyari.example.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashMap;

/*
 *
 *
 */
@Entity
@Table(name = "user_review")
//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
public class User_review implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    @Column(name = "review_id")
    private String review_id;

    @Column(name = "user_id")
    private String user_id;

    @Column(name = "interview")
    private int interview;

    @Column(name = "selection")
    private int selection;

    @Column(name = "review_company")
    private int review_company;

    @Column(name = "synthesis")
    private int synthesis;

    @Column(name = "review_message")
    private int review_message;

    public User_review() {
    }

    public User_review(String review_id, String user_id, int interview, int selection,
                       int review_company, int synthesis, int review_message) {
        this.review_id = review_id;
        this.user_id = user_id;
        this.interview = interview;
        this.selection = selection;
        this.review_company = review_company;
        this.synthesis = synthesis;
        this.review_message = review_message;
    }

    public String getReview_id() {
        return review_id;
    }

    public void setReview_id(String review_id) {
        this.review_id = review_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public int getInterview() {
        return interview;
    }

    public void setInterview(int interview) {
        this.interview = interview;
    }

    public int getSelection() {
        return selection;
    }

    public void setSelection(int selection) {
        this.selection = selection;
    }

    public int getReview_company() {
        return review_company;
    }

    public void setReview_company(int review_company) {
        this.review_company = review_company;
    }

    public int getSynthesis() {
        return synthesis;
    }

    public void setSynthesis(int synthesis) {
        this.synthesis = synthesis;
    }

    public int getReview_message() {
        return review_message;
    }

    public void setReview_message(int review_message) {
        this.review_message = review_message;
    }


    @Override
    public String toString() {
        return "user_id = " + this.user_id
                ;
    }
}
