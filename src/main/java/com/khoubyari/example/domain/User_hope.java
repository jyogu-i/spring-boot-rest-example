package com.khoubyari.example.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashMap;

/*
 *
 *
 */
@Entity
@Table(name = "user_hope")
//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
public class User_hope implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    @Column(name = "user_id")
    private String user_id;

    @Column(name = "h_company_name")
    private String h_company_name;

    @Column(name = "place")
    private String place;

    @Column(name = "income")
    private int income;

    @Column(name = "scale")
    private int scale;

    @Column(name = "work")
    private int work;

    @Column(name = "industry")
    private int industry;

    @Column(name = "h_job_category")
    private int h_job_category;

    public User_hope() {
    }

    public User_hope(String user_id, String h_company_name, String place,
                     int income, int scale, int work, int industry, int h_job_category) {
        this.user_id = user_id;
        this.h_company_name = h_company_name;
        this.place = place;
        this.income = income;
        this.scale = scale;
        this.work = work;
        this.industry = industry;
        this.h_job_category = h_job_category;
    }

    public String getUser_id() {
        return user_id;
    }
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getH_company_name() {
        return h_company_name;
    }

    public void setH_company_name(String h_company_name) {
        this.h_company_name = h_company_name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getScale() {
        return scale;
    }

    public void setMajor(int major) {
        this.scale = scale;
    }

    public int getWork() {
        return work;
    }

    public void setWork(int work) {
        this.work = work;
    }

    public int getIndustry() {
        return industry;
    }

    public void setIndustry(int industry) {
        this.industry = industry;
    }

    public int getH_job_category() {
        return h_job_category;
    }

    public void setH_job_category(int h_job_category) {
        this.h_job_category = h_job_category;
    }


    @Override
    public String toString() {
        return "user_id = " + this.user_id;
    }
}
