package com.khoubyari.example.dao.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Basic implements Serializable{
    private static final long serialVersionUID = 1L;

    String userId;

    String gender;

    Integer age;

    String academicId;

    String school;

    String major;

    String timesId;

    String englishId;

    String skill;

    String lastName;

    String firstName;

    String h_industry;

    String h_industry_middle;

    String h_industry_small;

    String h_job_category;

    String h_job_category_middle;

    String h_job_category_small;

    String p_industry;

    String p_industry_middle;

    String p_industry_small;

    String p_job_category;

    String p_job_category_middle;

    String p_job_category_small;

    String p_company_name;

    int joined_year;

    String password;

    String mail;


    public String getUser() {
        return userId;
    }

    public void setUser(String userId) {
        this.userId = userId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAcademicId() {
        return academicId;
    }

    public void setAcademicId(String academicId) {
        this.academicId = academicId;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajorId(String majorId) {
        this.major = majorId;
    }

    public String getTimesId() {
        return timesId;
    }

    public void setTimes(String timesId) {
        this.timesId = timesId;
    }

    public String getEnglish() {
        return englishId;
    }

    public void setEnglish(String englishId) {
        this.englishId = englishId;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getH_industry() {
        return h_industry;
    }

    public void setH_industry(String h_industry) {
        this.h_industry = h_industry;
    }

    public String getH_industry_middle() {
        return h_industry_middle;
    }

    public void setH_industry_middle(String h_industry_middle) {
        this.h_industry_middle = h_industry_middle;
    }

    public String getH_industry_small() {
        return h_industry_small;
    }

    public void setH_industry_small(String h_industry_small) {
        this.h_industry_small = h_industry_small;
    }

    public String getH_job_category() {
        return h_job_category;
    }

    public void setH_job_category(String h_job_category) {
        this.h_job_category = h_job_category;
    }

    public String getH_job_category_middle() {
        return h_job_category_middle;
    }

    public void setH_job_category_middle(String h_job_category_middle) {
        this.h_job_category_middle = h_job_category_middle;
    }

    public String getH_job_category_small() {
        return h_job_category_small;
    }

    public void setH_job_category_small(String h_job_category_small) {
        this.h_job_category_small = h_job_category_small;
    }

    public String getP_industry() {
        return p_industry;
    }

    public void setP_industry(String p_industry) {
        this.p_industry = p_industry;
    }

    public String getP_industry_middle() {
        return p_industry_middle;
    }

    public void setP_industry_middle(String p_industry_middle) {
        this.p_industry_middle = p_industry_middle;
    }

    public String getP_industry_small() {
        return p_industry_small;
    }

    public void setP_industry_small(String p_industry_small) {
        this.p_industry_small = p_industry_small;
    }

    public String getP_job_category() {
        return p_job_category;
    }

    public void setP_job_category(String p_job_category) {
        this.p_job_category = p_job_category;
    }

    public String getP_job_category_middle() {
        return p_job_category_middle;
    }

    public void setP_job_category_middle(String p_job_category_middle) {
        this.p_job_category_middle = p_job_category_middle;
    }

    public String getP_job_category_small() {
        return p_job_category_small;
    }

    public void setP_job_category_small(String p_job_category_small) {
        this.p_job_category_small = p_job_category_small;
    }

    public Integer getJoined_year() {
        return joined_year;
    }

    public void setJoined_year(Integer joined_year) {
        this.joined_year = joined_year;
    }

    public String getP_company_name() {
        return p_company_name;
    }

    public void setP_company_name(String p_company_name) {
        this.p_company_name = p_company_name;
    }


}