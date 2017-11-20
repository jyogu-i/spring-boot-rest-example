package com.khoubyari.example.dao.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "ca_result_job_category")
public class CaResultJobCategory {

    /** */
    @Id
    @Column(name = "result_job_category_id")
    Integer resultJobCategoryId;

    /** */
    @Column(name = "job_category_id")
    String jobCategoryId;

    /** */
    @Column(name = "ca_id")
    String caId;

    /** */
    @Column(name = "job_category_number")
    Integer jobCategoryNumber;

    /** */
    @Column(name = "job_category_closerate")
    Integer jobCategoryCloserate;

    /** 
     * Returns the resultJobCategoryId.
     * 
     * @return the resultJobCategoryId
     */
    public Integer getResultJobCategoryId() {
        return resultJobCategoryId;
    }

    /** 
     * Sets the resultJobCategoryId.
     * 
     * @param resultJobCategoryId the resultJobCategoryId
     */
    public void setResultJobCategoryId(Integer resultJobCategoryId) {
        this.resultJobCategoryId = resultJobCategoryId;
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

    /** 
     * Returns the caId.
     * 
     * @return the caId
     */
    public String getCaId() {
        return caId;
    }

    /** 
     * Sets the caId.
     * 
     * @param caId the caId
     */
    public void setCaId(String caId) {
        this.caId = caId;
    }

    /** 
     * Returns the jobCategoryNumber.
     * 
     * @return the jobCategoryNumber
     */
    public Integer getJobCategoryNumber() {
        return jobCategoryNumber;
    }

    /** 
     * Sets the jobCategoryNumber.
     * 
     * @param jobCategoryNumber the jobCategoryNumber
     */
    public void setJobCategoryNumber(Integer jobCategoryNumber) {
        this.jobCategoryNumber = jobCategoryNumber;
    }

    /** 
     * Returns the jobCategoryCloserate.
     * 
     * @return the jobCategoryCloserate
     */
    public Integer getJobCategoryCloserate() {
        return jobCategoryCloserate;
    }

    /** 
     * Sets the jobCategoryCloserate.
     * 
     * @param jobCategoryCloserate the jobCategoryCloserate
     */
    public void setJobCategoryCloserate(Integer jobCategoryCloserate) {
        this.jobCategoryCloserate = jobCategoryCloserate;
    }
}