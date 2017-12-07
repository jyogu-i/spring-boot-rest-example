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
    @Column(name = "big_industry")
    String bigIndustry;

    /** */
    @Column(name = "middle_industry")
    String middleIndustry;

    /** */
    @Column(name = "small_industry")
    String smallIndustry;

    /** */
    @Column(name = "big_industry_id")
    String bigIndustryId;

    /** */
    @Column(name = "middle_industry_id")
    String middleIndustryId;

    /** */
    @Column(name = "small_industry_id")
    String smallIndustryId;

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

    public String getBigIndustry() {
        return bigIndustry;
    }

    public void setBigIndustry(String bigIndustry) {
        this.bigIndustry = bigIndustry;
    }

    public String getMiddleIndustry() {
        return middleIndustry;
    }

    public void setMiddleIndustry(String middleIndustry) {
        this.middleIndustry = middleIndustry;
    }

    public String getSmallIndustry() {
        return smallIndustry;
    }

    public void setSmallIndustry(String smallIndustry) {
        this.smallIndustry = smallIndustry;
    }

    public String getBigIndustryId() {
        return bigIndustryId;
    }

    public void setBigIndustryId(String bigIndustryId) {
        this.bigIndustryId = bigIndustryId;
    }

    public String getMiddleIndustryId() {
        return middleIndustryId;
    }

    public void setMiddleIndustryId(String middleIndustryId) {
        this.middleIndustryId = middleIndustryId;
    }

    public String getSmallIndustryId() {
        return smallIndustryId;
    }

    public void setSmallIndustryId(String smallIndustryId) {
        this.smallIndustryId = smallIndustryId;
    }

}