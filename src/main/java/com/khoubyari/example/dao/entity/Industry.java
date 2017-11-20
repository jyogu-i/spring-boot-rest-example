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

    /** */
    @Column(name = "big_category_id")
    String bigCategoryId;

    /** */
    @Column(name = "middle_category_id")
    String middleCategoryId;

    /** */
    @Column(name = "small_category_id")
    String smallCategoryId;

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

    public String getMiddleCategoryId() {
        return middleCategoryId;
    }

    public void setMiddleCategoryId(String middleCategoryId) {
        this.middleCategoryId = middleCategoryId;
    }

    public String getSmallCategoryId() {
        return smallCategoryId;
    }

    public void setSmallCategoryId(String smallCategoryId) {
        this.smallCategoryId = smallCategoryId;
    }

}