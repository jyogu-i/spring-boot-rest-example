package net.mybrainlab.sync.naimono.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = CaResultIndustryListener.class)
@Table(name = "ca_result_industry")
public class CaResultIndustry {

    /** */
    @Id
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

    /** 
     * Returns the resultIndustryId.
     * 
     * @return the resultIndustryId
     */
    public Integer getResultIndustryId() {
        return resultIndustryId;
    }

    /** 
     * Sets the resultIndustryId.
     * 
     * @param resultIndustryId the resultIndustryId
     */
    public void setResultIndustryId(Integer resultIndustryId) {
        this.resultIndustryId = resultIndustryId;
    }

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
     * Returns the industryNumber.
     * 
     * @return the industryNumber
     */
    public Integer getIndustryNumber() {
        return industryNumber;
    }

    /** 
     * Sets the industryNumber.
     * 
     * @param industryNumber the industryNumber
     */
    public void setIndustryNumber(Integer industryNumber) {
        this.industryNumber = industryNumber;
    }

    /** 
     * Returns the industryCloserate.
     * 
     * @return the industryCloserate
     */
    public Integer getIndustryCloserate() {
        return industryCloserate;
    }

    /** 
     * Sets the industryCloserate.
     * 
     * @param industryCloserate the industryCloserate
     */
    public void setIndustryCloserate(Integer industryCloserate) {
        this.industryCloserate = industryCloserate;
    }
}