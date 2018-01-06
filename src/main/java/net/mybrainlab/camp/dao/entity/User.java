package net.mybrainlab.camp.dao.entity;

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

    @Column(name = "leave")
    int leave;

    @Column(name = "update")
    String update;


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

    public int getLeave() {
        return leave;
    }

    public void setLeave(int leave) {
        this.leave = leave;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }


}