package net.mybrainlab.camp.dao.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;

import java.io.Serializable;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class AllUerInfo implements Serializable{
    private static final long serialVersionUID = 1L;

    @Column(name = "user_id")
    String userId;

    /** */
    @Column(name = "gender")
    String gender;

    /** */
    @Column(name = "age")
    Integer age;

    /** */
    @Column(name = "academic_id")
    String academicId;

    /** */
    @Column(name = "school")
    String school;

    /** */
    @Column(name = "major")
    String major;

    /** */
    @Column(name = "times")
    String times;

    /** */
    @Column(name = "english")
    String english;

    /** */
    @Column(name = "term_id")
    String termId;

    /** */
    @Column(name = "skill")
    String skill;

    /** */
    @Column(name = "timing_id")
    String timingId;

    /** */
    @Column(name = "last_name")
    String lastName;

    /** */
    @Column(name = "first_name")
    String firstName;

    /** */
    @Column(name = "cellphone")
    String cellphone;

    @Column(name = "update")
    String update;

    /** */
    @Column(name = "p_company_name")
    String pcompanyName;

    /** */
    @Column(name = "joined_year")
    Integer joinedYear;

    /** */
    @Column(name = "big_category")
    String bigCategory;

    /** */
    @Column(name = "middle_category")
    String middleCategory;

    /** */
    @Column(name = "small_category")
    String smallCategory;

    /** */
    @Column(name = "middle_category_id")
    String middleCategoryId;

    /** */
    @Column(name = "small_category_id")
    String smallCategoryId;

    @Column(name = "big_industry")
    String bigIndustry;

    /** */
    @Column(name = "middle_industry")
    String middleIndustry;

    /** */
    @Column(name = "small_industry")
    String smallIndustry;

    /** */
    @Column(name = "big_industry_id")
    String bigIndustryId;

    /** */
    @Column(name = "middle_industry_id")
    String middleIndustryId;

    /** */
    @Column(name = "small_industry_id")
    String smallIndustryId;

    /** */
    @Column(name = "h_company_name")
    String hcompanyName;

    /** */
    @Column(name = "place_id")
    String placeId;

    /** */
    @Column(name = "income")
    String income;

    /** */
    @Column(name = "scale_number")
    String scaleNumber;

    @Column(name = "scale_type_id")
    String scaleTypeId;

    /** */
    @Column(name = "work_id")
    String workId;

    /** */
    @Column(name = "h_industry_id")
    String hindustryId;


    public String getPCompanyName() {
        return pcompanyName;
    }

    public void setPCompanyName(String companyName) {
        this.pcompanyName = pcompanyName;
    }

    public Integer getJoinedYear() {
        return joinedYear;
    }

    public void setJoinedYear(Integer joinedYear) {
        this.joinedYear = joinedYear;
    }

    public String getBigCategory() {
        return bigCategory;
    }

    public void setBigCategory(String bigCategory) {
        this.bigCategory = bigCategory;
    }

    public String getMiddleCategory() {
        return middleCategory;
    }

    public void setMiddleCategory(String middleCategory) {
        this.middleCategory = middleCategory;
    }

    public String getSmallCategory() {
        return smallCategory;
    }

    public void setSmallCategory(String smallCategory) {
        this.smallCategory = smallCategory;
    }

    public void setMiddleCategoryId(String middleCategoryId) {
        this.middleCategoryId = middleCategoryId;
    }

    public String getMiddleCategoryId() {
        return middleCategoryId;
    }

    public String getSmallCategoryId() {
        return smallCategoryId;
    }

    public void setSmallCategoryId(String smallCategoryId) {
        this.smallCategoryId = smallCategoryId;
    }

    public String getBigIndustry() {
        return bigIndustry;
    }

    public void setBigIndustry(String bigIndustry) {
        this.bigIndustry = bigIndustry;
    }

    public String getMiddleIndustry() {
        return middleIndustry;
    }

    public void setMiddleIndustry(String middleIndustry) {
        this.middleIndustry = middleIndustry;
    }

    public String getSmallIndustry() {
        return smallIndustry;
    }

    public void setSmallIndustry(String smallIndustry) {
        this.smallIndustry = smallIndustry;
    }

    public String getBigIndustryId() {
        return bigIndustryId;
    }

    public void setBigIndustryId(String bigIndustryId) {
        this.bigIndustryId = bigIndustryId;
    }

    public String getMiddleIndustryId() {
        return middleIndustryId;
    }

    public void setMiddleIndustryId(String middleIndustryId) {
        this.middleIndustryId = middleIndustryId;
    }

    public String getSmallIndustryId() {
        return smallIndustryId;
    }

    public void setSmallIndustryId(String smallIndustryId) {
        this.smallIndustryId = smallIndustryId;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
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

    public void setMajor(String major) {
        this.major = major;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglishId(String english) {
        this.english = english;
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

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

    public String gethCompanyName() {
        return hcompanyName;
    }

    public void sethCompanyName(String hcompanyName) {
        this.hcompanyName = hcompanyName;
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getScaleNumber() {
        return scaleNumber;
    }

    public void setScaleNumber(String scaleNumber) {
        this.scaleNumber = scaleNumber;
    }

    public String getScaleTypeId() {
        return scaleTypeId;
    }

    public void setScaleTypeId(String scaleTypeId) {
        this.scaleTypeId = scaleTypeId;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getHIndustryId() {
        return hindustryId;
    }

    public void setHIndustryId(String hindustryId) {
        this.hindustryId = hindustryId;
    }


}