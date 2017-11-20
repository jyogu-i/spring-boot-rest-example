package com.khoubyari.example.dao.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "industry")
public class Industry {

    /** */
    @Id
    @Column(name = "industry_id")
    String industryId;

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