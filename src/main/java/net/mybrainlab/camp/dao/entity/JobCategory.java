package net.mybrainlab.camp.dao.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "job_category")
public class JobCategory {

    /** */
    @Id
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
     * Returns the bigCategory.
     * 
     * @return the bigCategory
     */
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