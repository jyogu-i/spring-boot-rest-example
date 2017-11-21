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

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
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

    public void setIndustryId(String industryId) {
        this.industryId = industryId;
    }

    public String getJobCategoryId() {
        return jobCategoryId;
    }

    public void setJobCategoryId(String jobCategoryId) {
        this.jobCategoryId = jobCategoryId;
    }
}