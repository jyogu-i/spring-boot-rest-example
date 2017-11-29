package com.khoubyari.example.dao.entity;

import org.seasar.doma.*;

/**
 */
@Entity
@Table(name = "Ca_result_industry")
public class CaResultIndustry {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "result_industry_id")
    Integer resultIndustryId;

    /** */
    @Column(name = "industry_id")
    String industryId;

    /** */
    @Column(name = "ca_id")
    String caId;

    /** */
    @Column(name = "industry_number")
    Integer industryNumber;

    /** */
    @Column(name = "industry_closerate")
    Integer industryCloserate;


    public Integer getResultIndustryId() {
        return resultIndustryId;
    }

    public void setResultIndustryId(Integer resultIndustryId) {
        this.resultIndustryId = resultIndustryId;
    }

    public String getIndustryId() {
        return industryId;
    }

    public void setIndustryId(String industryId) {
        this.industryId = industryId;
    }

    public String getCaId() {
        return caId;
    }

    public void setCaId(String caId) {
        this.caId = caId;
    }

    public Integer getIndustryNumber() {
        return industryNumber;
    }

    public void setIndustryNumber(Integer industryNumber) {
        this.industryNumber = industryNumber;
    }

    public Integer getIndustryCloserate() {
        return industryCloserate;
    }

    public void setIndustryCloserate(Integer industryCloserate) {
        this.industryCloserate = industryCloserate;
    }
}