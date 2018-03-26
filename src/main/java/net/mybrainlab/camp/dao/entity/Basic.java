package net.mybrainlab.camp.dao.entity;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Basic implements Serializable {

    // キー
    String userId;

    /** 氏名 */
    String name;

    /** 性別 */
    String gender;

    /** 年齢 */
    Integer age;

    /** 学校名 */
    String school;

    /** 専攻 */
    String major;

    /** 卒業年 */
    String graduation_year;

    // 現職・職歴
    /** 経験企業名 */
    String p_company_name;

    /** 在籍期間(入社年) */
    String joined_year;

    /** 在籍期間(退社年) */
    String leaving_year;

    /** 業界(大) */
    String p_industry;

    /** 業界(中) */
    String p_industry_middle;

    /** 業界(小) */
    String p_industry_small;

    /** 職種(大) */
    String p_job_category;

    /** 職種(中) */
    String p_job_category_middle;

    /** 職種(小) */
    String p_job_category_small;

    // 希望
    /** 希望企業名 */
    String h_company_name;

    /** 希望業界(大) */
    String h_industry;

    /** 希望業界(中) */
    String h_industry_middle;

    /** 希望業界(小) */
    String h_industry_small;

    /** 希望職種(大) */
    String h_job_category;

    /** 希望職種(中) */
    String h_job_category_middle;

    /** 希望職種(小) */
    String h_job_category_small;


}