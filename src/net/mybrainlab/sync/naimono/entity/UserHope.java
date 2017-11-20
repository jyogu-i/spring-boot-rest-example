package net.mybrainlab.sync.naimono.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = UserHopeListener.class)
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
    Integer placeId;

    /** */
    @Column(name = "income")
    Integer income;

    /** */
    @Column(name = "scale_id")
    Integer scaleId;

    /** */
    @Column(name = "work_id")
    Integer workId;

    /** */
    @Column(name = "industry_id")
    Integer industryId;

    /** */
    @Column(name = "job_category_id")
    Integer jobCategoryId;

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
    public Integer getPlaceId() {
        return placeId;
    }

    /** 
     * Sets the placeId.
     * 
     * @param placeId the placeId
     */
    public void setPlaceId(Integer placeId) {
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
    public Integer getScaleId() {
        return scaleId;
    }

    /** 
     * Sets the scaleId.
     * 
     * @param scaleId the scaleId
     */
    public void setScaleId(Integer scaleId) {
        this.scaleId = scaleId;
    }

    /** 
     * Returns the workId.
     * 
     * @return the workId
     */
    public Integer getWorkId() {
        return workId;
    }

    /** 
     * Sets the workId.
     * 
     * @param workId the workId
     */
    public void setWorkId(Integer workId) {
        this.workId = workId;
    }

    /** 
     * Returns the industryId.
     * 
     * @return the industryId
     */
    public Integer getIndustryId() {
        return industryId;
    }

    /** 
     * Sets the industryId.
     * 
     * @param industryId the industryId
     */
    public void setIndustryId(Integer industryId) {
        this.industryId = industryId;
    }

    /** 
     * Returns the jobCategoryId.
     * 
     * @return the jobCategoryId
     */
    public Integer getJobCategoryId() {
        return jobCategoryId;
    }

    /** 
     * Sets the jobCategoryId.
     * 
     * @param jobCategoryId the jobCategoryId
     */
    public void setJobCategoryId(Integer jobCategoryId) {
        this.jobCategoryId = jobCategoryId;
    }
}