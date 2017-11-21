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

    String user;

    String gender;

    Integer age;

    String academic;

    String school;

    String major;

    String times;

    String english;

    String term;

    String skill;

    String timing;

    String lastName;

    String firstName;

    String h_industry;

    String h_job_category;

    String p_industry;

    String p_job_category;

    int joined_year;

    String password;

    String mail;


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
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

    public String getAcademic() {
        return academic;
    }

    public void setAcademic(String academic) {
        this.academic = academic;
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

    public void setMajor(String majorId) {
        this.major = majorId;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String timesId) {
        this.times = timesId;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
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

    public String getHIndustry() {
        return h_industry;
    }

    public void setHIndustry(String h_industry) {
        this.h_industry = h_industry;
    }

    public String getHJobCategory() {
        return h_job_category;
    }

    public void setHJobCategory(String h_job_category) {
        this.h_job_category = h_job_category;
    }

    public String getPIndustry() {
        return p_industry;
    }

    public void setPIndustry(String p_industry) {
        this.p_industry = p_industry;
    }

    public String getPJobCategory() {
        return p_job_category;
    }

    public void setPJobCategory(String p_job_category) {
        this.p_job_category = p_job_category;
    }

    public Integer getJoinedYear() {
        return joined_year;
    }

    public void setJoinedYear(Integer joinedYear) {
        this.joined_year = joined_year;
    }

    @Override
    public String toString(){
        return this.academic;
    }


}