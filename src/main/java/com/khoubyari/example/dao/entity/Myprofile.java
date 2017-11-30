package com.khoubyari.example.dao.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Myprofile implements Serializable{
    private static final long serialVersionUID = 1L;

    String userId;

    String gender;

    Integer age;

    String academicId;

    String school;

    String major;

    String timesId;

    String englishId;

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

    String companyName;

    String placeId;

    String income;

    String scaleNumberId;

    String scaleTypeId;

    String workId;

    String skill;

    String timingId;

    String termId;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getH_company() {
        return companyName;
    }

    public void setH_company(String companyName) {
        this.companyName = companyName;
    }

    public String getPlace() {
        return placeId;
    }

    public void setPlace(String placeId) {
        this.placeId = placeId;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getScaleNumber() {
        return scaleNumberId;
    }

    public void setScaleNumber(String scaleNumberId) {
        this.scaleNumberId = scaleNumberId;
    }

    public String getScaleType() {
        return scaleTypeId;
    }

    public void setScaleType(String scaleTypeId) {
        this.scaleTypeId = scaleTypeId;
    }

    public String getWork() {
        return workId;
    }

    public void setWork(String workId) {
        this.workId = workId;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
    public String getTiming() {
        return timingId;
    }

    public void setTiming(String timingId) {
        this.timingId = timingId;
    }

    public String getTerm() {
        return termId;
    }

    public void setTerm(String termId) {
        this.termId = termId;
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

    public String getTimes() {
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

    public String getH_bigIndustry() {
        return h_industry;
    }

    public void setH_bigIndustry(String h_industry) {
        this.h_industry = h_industry;
    }

    public String getH_middleIndustry() {
        return h_industry_middle;
    }

    public void setH_middleIndustry(String h_industry_middle) {
        this.h_industry_middle = h_industry_middle;
    }

    public String getH_smallIndustry() {
        return h_industry_small;
    }

    public void setH_smallIndustry(String h_industry_small) {
        this.h_industry_small = h_industry_small;
    }

    public String getP_industry_small() {
        return p_industry_small;
    }

    public void setP_industry_small(String p_industry_small) {
        this.p_industry_small = p_industry_small;
    }


    public String getH_bigCategory() {
        return h_job_category;
    }

    public void setH_bigCategory(String h_job_category) {
        this.h_job_category = h_job_category;
    }

    public String getH_middleCategory() {
        return h_job_category_middle;
    }

    public void setH_middleCategory(String h_job_category_middle) {
        this.h_job_category_middle = h_job_category_middle;
    }

    public String getH_smallCategory() {
        return h_job_category_small;
    }

    public void setH_smallCategory(String h_job_category_small) {
        this.h_job_category_small = h_job_category_small;
    }

    public String getBigIndustry() {
        return p_industry;
    }

    public void setBigIndustry(String p_industry) {
        this.p_industry = p_industry;
    }

    public String getMiddleIndustry() {
        return p_industry_middle;
    }

    public void setMiddleIndustry(String p_industry_middle) {
        this.p_industry_middle = p_industry_middle;
    }

    public String getSmallIndustry() {
        return p_industry_small;
    }

    public void setSmallIndustry(String p_industry_small) {
        this.p_industry_small = p_industry_small;
    }

    public String getBigCategory() {
        return p_job_category;
    }

    public void setBigCategory(String p_job_category) {
        this.p_job_category = p_job_category;
    }

    public String getMiddleCategory() {
        return p_job_category_middle;
    }

    public void setMiddleCategory(String p_job_category_middle) {
        this.p_job_category_middle = p_job_category_middle;
    }

    public String getSmallCategory() {
        return p_job_category_small;
    }

    public void setSmallCategory(String p_job_category_small) {
        this.p_job_category_small = p_job_category_small;
    }

    public Integer getJoined_year() {
        return joined_year;
    }

    public void setJoined_year(Integer joinedYear) {
        this.joined_year = joined_year;
    }

    public String getP_company() {
        return p_company_name;
    }

    public void setP_company(String p_company_name) {
        this.p_company_name = p_company_name;
    }

}