package net.mybrainlab.camp.dao.entity;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

import java.util.Date;

/**
 */
@Entity
@Table(name = "User")
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
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

    /** Graduation year */
    @Column(name = "graduation_year")
    String graduationYear;

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
    @Column(name = "name")
    String name;

    /** */
    @Column(name = "yomigana")
    String yomigana;

    /** */
    @Column(name = "mail")
    String mail;

    /** */
    @Column(name = "password")
    String password;

    @Column(name = "old_password")
    String old_password;

    @Column(name = "leave")
    int leave;

    @Column(name = "update")
    String update;

    @Column(name = "mailcheck")
    int mailcheck;

    @Column(name = "token")
    int token;

    // timestamp
    @Column(name = "token_expire")
    Date tokenExpire;

}