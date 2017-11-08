package com.khoubyari.example.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashMap;

/*
 *
 *
 */
@Entity
@Table(name = "user")
//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    @Column(name = "user_id")
    private String user_id;

    @Column(name = "gender_id")
    private String gender_id;
    private User_hope user_hope;

    @Column()
    String city;

    @Column(name = "age")
    private int age;

    @Column(name = "academic_id")
    private String academic_id;

    @Column(name = "previous_id")
    private String previous_id;


    @Column(name = "school")
    private String school;

    @Column(name = "major_id")
    private String major_id;

    @Column(name = "times_id")
    private String times_id;

    @Column(name = "english_id")
    private String english_id;

    @Column(name = "term_id")
    private String term_id;

    @Column(name = "skill")
    private String skill;

    @Column(name = "timing_id")
    private String timing_id;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "mail")
    private String mail;

    @Column(name = "password1")
    private String password;

    public User() {
    }

    public User(String user_id, String gender_id, String previous_id,
                int age, String academic_id, String school, String major_id,
                String times_id, String english_id, String term_id, String skill, String timing_id,
                String last_name, String first_name, String mail,
                String password) {
        this.user_id = user_id;
        this.gender_id = gender_id;
        this.previous_id = previous_id;
        this.age = age;
        this.academic_id = academic_id;
        this.school = school;
        this.major_id = major_id;
        this.times_id = times_id;
        this.english_id = english_id;
        this.term_id = term_id;
        this.skill = skill;
        this.timing_id = timing_id;
        this.last_name = last_name;
        this.first_name = first_name;
        this.mail = mail;
        this.password = password;
    }

    public String getUser_id() {
        return user_id;
    }
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public String getGender() {
        return gender_id;
    }

    public void setGender(String gender_id) {
        this.gender_id = gender_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAcademic_id() {
        return academic_id;
    }

    public void setAcademic_id(String academic_id) {
        this.academic_id = academic_id;
    }

    public String getPrevious_id() {
        return previous_id;
    }

    public void setPrevious_id(String previous_id) {
        this.previous_id = previous_id;
    }


    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor_id() {
        return major_id;
    }

    public void setMajor_id(String major_id) {
        this.major_id = major_id;
    }


    public String getTime_id() {
        return times_id;
    }

    public void setTimes_id(String times_id) {
        this.times_id = times_id;
    }

    public String getEnglish_id() {
        return english_id;
    }

    public void setEnglish_id(String english_id) {
        this.english_id = english_id;
    }

    public String getTerm_id() {
        return term_id;
    }

    public void setTerm_id(String term_id) {
        this.term_id = term_id;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getTiming_id() {
        return timing_id;
    }

    public void setTiming_id(String timing_id) {
        this.timing_id = timing_id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    @Override
    public String toString() {
        return "user_id = " + this.user_id
                ;
    }
}
