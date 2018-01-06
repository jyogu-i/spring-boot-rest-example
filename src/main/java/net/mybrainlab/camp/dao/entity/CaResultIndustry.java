package net.mybrainlab.camp.dao.entity;

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