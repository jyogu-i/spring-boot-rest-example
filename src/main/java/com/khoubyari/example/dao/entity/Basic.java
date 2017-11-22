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

    String genderId;

    Integer age;

    String academicId;

    String school;

    String majorId;

    String timesId;

    String englishId;

    String termId;

    String skill;

    String timingId;

    String lastName;

    String firstName;

    String h_industry;

    String h_job_category;

    String p_industry;

    String p_job_category;

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
        return genderId;
    }

    public void setGender(String gender) {
        this.genderId = genderId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAcademic() {
        return academicId;
    }

    public void setAcademic(String academic) {
        this.academicId = academic;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return majorId;
    }

    public void setMajorId(String majorId) {
        this.majorId = majorId;
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

    public String getTermId() {
        return termId;
    }

    public void setTermId(String termId) {
        this.termId = termId;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getTimingId() {
        return timingId;
    }

    public void setTimingId(String timingId) {
        this.timingId = timingId;
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

    public String getPCompanyName() {
        return p_company_name;
    }

    public void setPCompanyName(String p_company_name) {
        this.p_company_name = p_company_name;
    }


}