package com.khoubyari.example.dao.entity;

import net.minidev.json.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "User")
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    /** */
    @Id
    @Column(name = "user_id")
    String userId;

    /** */
    @Column(name = "gender_id")
    String genderId;

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
    @Column(name = "major_id")
    String majorId;

    /** */
    @Column(name = "times_id")
    String timesId;

    /** */
    @Column(name = "english_id")
    String englishId;

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

    /** */
    @Column(name = "password")
    String password;

    @Column(name = "company_name")
    String PcompanyName;

    @Column(name = "company_name")
    String HcompanyName;

    /** */
    @Column(name = "place_id")
    String placeId;

    /** */
    @Column(name = "income")
    String income;

    /** */
    @Column(name = "scale_number_id")
    String scaleNumberId;

    @Column(name = "scale_type_id")
    String scaleTypeId;

    /** */
    @Column(name = "work_id")
    String workId;

    @Column(name = "industry_id")
    String PindustryId;

    @Column(name = "job_category_id")
    String PjobCategoryId;

    @Column(name = "previous_id")
    Integer previousId;

    @Column(name = "joined_year")
    Integer joinedYear;

    @Column(name = "job_category_id")
    String HjobCategoryId;

    @Column(name = "industry_id")
    String HindustryId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGenderId() {
        return genderId;
    }

    public void setGenderId(String genderId) {
        this.genderId = genderId;
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

    public String getMajorId() {
        return majorId;
    }

    public void setMajorId(String majorId) {
        this.majorId = majorId;
    }

    public String getTimesId() {
        return timesId;
    }

    public void setTimesId(String timesId) {
        this.timesId = timesId;
    }

    public String getEnglishId() {
        return englishId;
    }

    public void setEnglishId(String englishId) {
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

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPCompanyName() {
        return PcompanyName;
    }

    public void setPCompanyName(String PcompanyName) {
        this.PcompanyName = PcompanyName;
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

    public String getScaleNumberId() {
        return scaleNumberId;
    }

    public void setScaleNumberId(String scaleNumberId) {
        this.scaleNumberId = scaleNumberId;
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

    public String getPIndustryId() {
        return PindustryId;
    }

    public void setPIndustryId(String PindustryId) {
        this.PindustryId = PindustryId;
    }

    public String getPJobCategoryId() {
        return PjobCategoryId;
    }

    public void setPJobCategoryId(String PjobCategoryId) {
        this.PjobCategoryId = PjobCategoryId;
    }

    public Integer getPreviousId() {
        return previousId;
    }

    public void setPreviousId(Integer previousId) {
        this.previousId = previousId;
    }

    public String getHCompanyName() {
        return HcompanyName;
    }

    public void setHCompanyName(String HcompanyName) {
        this.HcompanyName = HcompanyName;
    }

    public Integer getJoinedYear() {
        return joinedYear;
    }

    public void setJoinedYear(Integer joinedYear) {
        this.joinedYear = joinedYear;
    }

    public String getHJobCategoryId() {
        return HjobCategoryId;
    }

    public void setHJobCategoryId(String HjobCategoryId) {
        this.HjobCategoryId = HjobCategoryId;
    }

    public String getHIndustryId() {
        return HindustryId;
    }

    public void setHIndustryId(String industryId) {
        this.HindustryId = HindustryId;
    }
}