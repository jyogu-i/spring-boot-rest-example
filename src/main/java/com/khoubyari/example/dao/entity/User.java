package com.khoubyari.example.dao.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "user")
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

    /** 
     * Returns the userId.
     * 
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /** 
     * Sets the userId.
     * 
     * @param userId the userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /** 
     * Returns the genderId.
     * 
     * @return the genderId
     */
    public String getGenderId() {
        return genderId;
    }

    /** 
     * Sets the genderId.
     * 
     * @param genderId the genderId
     */
    public void setGenderId(String genderId) {
        this.genderId = genderId;
    }

    /** 
     * Returns the age.
     * 
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /** 
     * Sets the age.
     * 
     * @param age the age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /** 
     * Returns the academicId.
     * 
     * @return the academicId
     */
    public String getAcademicId() {
        return academicId;
    }

    /** 
     * Sets the academicId.
     * 
     * @param academicId the academicId
     */
    public void setAcademicId(String academicId) {
        this.academicId = academicId;
    }

    /** 
     * Returns the school.
     * 
     * @return the school
     */
    public String getSchool() {
        return school;
    }

    /** 
     * Sets the school.
     * 
     * @param school the school
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /** 
     * Returns the majorId.
     * 
     * @return the majorId
     */
    public String getMajorId() {
        return majorId;
    }

    /** 
     * Sets the majorId.
     * 
     * @param majorId the majorId
     */
    public void setMajorId(String majorId) {
        this.majorId = majorId;
    }

    /** 
     * Returns the timesId.
     * 
     * @return the timesId
     */
    public String getTimesId() {
        return timesId;
    }

    /** 
     * Sets the timesId.
     * 
     * @param timesId the timesId
     */
    public void setTimesId(String timesId) {
        this.timesId = timesId;
    }

    /** 
     * Returns the englishId.
     * 
     * @return the englishId
     */
    public String getEnglishId() {
        return englishId;
    }

    /** 
     * Sets the englishId.
     * 
     * @param englishId the englishId
     */
    public void setEnglishId(String englishId) {
        this.englishId = englishId;
    }

    /** 
     * Returns the termId.
     * 
     * @return the termId
     */
    public String getTermId() {
        return termId;
    }

    /** 
     * Sets the termId.
     * 
     * @param termId the termId
     */
    public void setTermId(String termId) {
        this.termId = termId;
    }

    /** 
     * Returns the skill.
     * 
     * @return the skill
     */
    public String getSkill() {
        return skill;
    }

    /** 
     * Sets the skill.
     * 
     * @param skill the skill
     */
    public void setSkill(String skill) {
        this.skill = skill;
    }

    /** 
     * Returns the timingId.
     * 
     * @return the timingId
     */
    public String getTimingId() {
        return timingId;
    }

    /** 
     * Sets the timingId.
     * 
     * @param timingId the timingId
     */
    public void setTimingId(String timingId) {
        this.timingId = timingId;
    }

    /** 
     * Returns the lastName.
     * 
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /** 
     * Sets the lastName.
     * 
     * @param lastName the lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /** 
     * Returns the firstName.
     * 
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /** 
     * Sets the firstName.
     * 
     * @param firstName the firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /** 
     * Returns the cellphone.
     * 
     * @return the cellphone
     */
    public String getCellphone() {
        return cellphone;
    }

    /** 
     * Sets the cellphone.
     * 
     * @param cellphone the cellphone
     */
    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    /** 
     * Returns the password.
     * 
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}