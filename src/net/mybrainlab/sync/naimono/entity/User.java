package net.mybrainlab.sync.naimono.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = UserListener.class)
@Table(name = "user")
public class User {

    /** */
    @Id
    @Column(name = "user_id")
    String userId;

    /** */
    @Column(name = "gender_id")
    Integer genderId;

    /** */
    @Column(name = "age")
    Integer age;

    /** */
    @Column(name = "academic_id")
    Integer academicId;

    /** */
    @Column(name = "school")
    String school;

    /** */
    @Column(name = "major_id")
    Integer majorId;

    /** */
    @Column(name = "times_id")
    Integer timesId;

    /** */
    @Column(name = "english_id")
    Integer englishId;

    /** */
    @Column(name = "term_id")
    Integer termId;

    /** */
    @Column(name = "skill")
    String skill;

    /** */
    @Column(name = "timing_id")
    Integer timingId;

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
    public Integer getGenderId() {
        return genderId;
    }

    /** 
     * Sets the genderId.
     * 
     * @param genderId the genderId
     */
    public void setGenderId(Integer genderId) {
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
    public Integer getAcademicId() {
        return academicId;
    }

    /** 
     * Sets the academicId.
     * 
     * @param academicId the academicId
     */
    public void setAcademicId(Integer academicId) {
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
    public Integer getMajorId() {
        return majorId;
    }

    /** 
     * Sets the majorId.
     * 
     * @param majorId the majorId
     */
    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    /** 
     * Returns the timesId.
     * 
     * @return the timesId
     */
    public Integer getTimesId() {
        return timesId;
    }

    /** 
     * Sets the timesId.
     * 
     * @param timesId the timesId
     */
    public void setTimesId(Integer timesId) {
        this.timesId = timesId;
    }

    /** 
     * Returns the englishId.
     * 
     * @return the englishId
     */
    public Integer getEnglishId() {
        return englishId;
    }

    /** 
     * Sets the englishId.
     * 
     * @param englishId the englishId
     */
    public void setEnglishId(Integer englishId) {
        this.englishId = englishId;
    }

    /** 
     * Returns the termId.
     * 
     * @return the termId
     */
    public Integer getTermId() {
        return termId;
    }

    /** 
     * Sets the termId.
     * 
     * @param termId the termId
     */
    public void setTermId(Integer termId) {
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
    public Integer getTimingId() {
        return timingId;
    }

    /** 
     * Sets the timingId.
     * 
     * @param timingId the timingId
     */
    public void setTimingId(Integer timingId) {
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

    /** 
     * Sets the password.
     * 
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}