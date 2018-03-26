package net.mybrainlab.camp.dao.entity;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Myprofile implements Serializable{
    private static final long serialVersionUID = 1L;

    String userId;

    String gender;

    Integer age;

    String academicId;

    String school;

    String major;

    String graduationYear;

    String timesId;

    String englishId;

    String name;

    String yomigana;

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

    String joinedYear;

    String leavingYear;

    String password;

    String mail;

    String h_company_name;

    String placeId;

    String income;

    String scaleNumberId;

    String scaleTypeId;

    String workId;

    String skill;

    String timingId;

    String termId;

}