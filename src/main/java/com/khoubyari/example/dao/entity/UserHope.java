package com.khoubyari.example.dao.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "user_hope")
public class UserHope {

    /** */
    @Id
    @Column(name = "user_id")
    String userId;

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
    @Column(name = "scale_number_id")
    String scaleNumberId;

    @Column(name = "scale_type_id")
    String scaleTypeId;

    /** */
    @Column(name = "work_id")
    String workId;

    /** */
    @Column(name = "h_industry_id")
    String industryId;

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
    @Column(name = "h_job_category_id")
    String jobCategoryId;

    /** */
    @Column(name = "big_category")
    String bigCategory;

    /** */
    @Column(name = "middle_category")
    String middleCategory;

    /** */
    @Column(name = "small_category")
    String smallCategory;

    @Column(name = "big_category_id")
    String bigCategoryId;

    /** */
    @Column(name = "middle_category_id")
    String middleCategoryId;

    /** */
    @Column(name = "small_category_id")
    String smallCategoryId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCompanyName() {
        return hcompanyName;
    }

    public void setCompanyName(String hcompanyName) {
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

    public String getIndustryId() {
        return industryId;
    }

    public void setIndustryId(String industryId) {
        this.industryId = industryId;
    }

    public String getJobCategoryId() {
        return jobCategoryId;
    }

    public void setJobCategoryId(String jobCategoryId) {
        this.jobCategoryId = jobCategoryId;
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

    public String getBigCategoryId() {
        return bigCategoryId;
    }

    public void setBigCategoryId(String bigCategoryId) {
        this.bigCategoryId = bigCategoryId;
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
}