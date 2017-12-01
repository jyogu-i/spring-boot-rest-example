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


    /** */
    @Column(name = "ca_id")
    String caId;

    /** */
    @Column(name = "job_category_number")
    Integer jobCategoryNumber;

    /** */
    @Column(name = "job_category_closerate")
    Integer jobCategoryCloserate;

    @Column(name = "job_category_id")
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