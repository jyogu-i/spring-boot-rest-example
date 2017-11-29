package com.khoubyari.example.dao.entity;

import org.seasar.doma.*;

/**
 */
@Entity
@Table(name = "Ca_result_job_category")
public class CaResultJobCategory {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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


    public Integer getResultJobCategoryId() {
        return resultJobCategoryId;
    }

    public void setResultJobCategoryId(Integer resultJobCategoryId) {
        this.resultJobCategoryId = resultJobCategoryId;
    }

    public String getJobCategoryId() {
        return jobCategoryId;
    }

    public void setJobCategoryId(String jobCategoryId) {
        this.jobCategoryId = jobCategoryId;
    }

    public String getCaId() {
        return caId;
    }

    public void setCaId(String caId) {
        this.caId = caId;
    }

    public Integer getJobCategoryNumber() {
        return jobCategoryNumber;
    }

    public void setJobCategoryNumber(Integer jobCategoryNumber) {
        this.jobCategoryNumber = jobCategoryNumber;
    }

    public Integer getJobCategoryCloserate() {
        return jobCategoryCloserate;
    }

    public void setJobCategoryCloserate(Integer jobCategoryCloserate) {
        this.jobCategoryCloserate = jobCategoryCloserate;
    }
}