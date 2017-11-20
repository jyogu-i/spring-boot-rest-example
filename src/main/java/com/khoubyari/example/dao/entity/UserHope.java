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
    @Column(name = "company_name")
    String companyName;

    /** */
    @Column(name = "place_id")
    String placeId;

    /** */
    @Column(name = "income")
    Integer income;

    /** */
    @Column(name = "scale_number_id")
    String scaleNumberId;

    @Column(name = "scale_type_id")
    String scaleTypeId;

    /** */
    @Column(name = "work_id")
    String workId;

    /** */
    @Column(name = "industry_id")
    String industryId;

    /** */
    @Column(name = "job_category_id")
    String jobCategoryId;

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
     * Returns the companyName.
     * 
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /** 
     * Sets the companyName.
     * 
     * @param companyName the companyName
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /** 
     * Returns the placeId.
     * 
     * @return the placeId
     */
    public String getPlaceId() {
        return placeId;
    }

    /** 
     * Sets the placeId.
     * 
     * @param placeId the placeId
     */
    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    /** 
     * Returns the income.
     * 
     * @return the income
     */
    public Integer getIncome() {
        return income;
    }

    /** 
     * Sets the income.
     * 
     * @param income the income
     */
    public void setIncome(Integer income) {
        this.income = income;
    }

    /** 
     * Returns the scaleId.
     * 
     * @return the scaleId
     */
    public String getScaleNumberId() {
        return scaleNumberId;
    }

    /** 
     * Sets the scaleId.
     * 
     * @param scaleNumberId the scaleId
     */
    public void setScaleNumberId(String scaleNumberId) {
        this.scaleNumberId = scaleNumberId;
    }

    public String getScaleTypeId() {
        return scaleTypeId;
    }

    /**
     * Sets the scaleId.
     *
     * @param scaleTypeId the scaleId
     */
    public void setScaleTypeId(String scaleTypeId) {
        this.scaleTypeId = scaleTypeId;
    }

    /** 
     * Returns the workId.
     * 
     * @return the workId
     */
    public String getWorkId() {
        return workId;
    }

    /** 
     * Sets the workId.
     * 
     * @param workId the workId
     */
    public void setWorkId(String workId) {
        this.workId = workId;
    }

    /** 
     * Returns the industryId.
     * 
     * @return the industryId
     */
    public String getIndustryId() {
        return industryId;
    }

    /** 
     * Sets the industryId.
     * 
     * @param industryId the industryId
     */
    public void setIndustryId(String industryId) {
        this.industryId = industryId;
    }

    /** 
     * Returns the jobCategoryId.
     * 
     * @return the jobCategoryId
     */
    public String getJobCategoryId() {
        return jobCategoryId;
    }

    /** 
     * Sets the jobCategoryId.
     * 
     * @param jobCategoryId the jobCategoryId
     */
    public void setJobCategoryId(String jobCategoryId) {
        this.jobCategoryId = jobCategoryId;
    }
}