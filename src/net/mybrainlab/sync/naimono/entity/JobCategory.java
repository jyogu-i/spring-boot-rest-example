package net.mybrainlab.sync.naimono.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = JobCategoryListener.class)
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

    /** 
     * Sets the bigCategory.
     * 
     * @param bigCategory the bigCategory
     */
    public void setBigCategory(String bigCategory) {
        this.bigCategory = bigCategory;
    }

    /** 
     * Returns the middleCategory.
     * 
     * @return the middleCategory
     */
    public String getMiddleCategory() {
        return middleCategory;
    }

    /** 
     * Sets the middleCategory.
     * 
     * @param middleCategory the middleCategory
     */
    public void setMiddleCategory(String middleCategory) {
        this.middleCategory = middleCategory;
    }

    /** 
     * Returns the smallCategory.
     * 
     * @return the smallCategory
     */
    public String getSmallCategory() {
        return smallCategory;
    }

    /** 
     * Sets the smallCategory.
     * 
     * @param smallCategory the smallCategory
     */
    public void setSmallCategory(String smallCategory) {
        this.smallCategory = smallCategory;
    }
}