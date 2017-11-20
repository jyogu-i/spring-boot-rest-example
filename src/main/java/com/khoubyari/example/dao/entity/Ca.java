package com.khoubyari.example.dao.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "ca")
public class Ca {

    /** */
    @Id
    @Column(name = "ca_id")
    String caId;

    /** */
    @Column(name = "ca_name")
    String caName;

    /** */
    @Column(name = "gender_id")
    Integer genderId;

    /** */
    @Column(name = "ca_company")
    String caCompany;

    /** */
    @Column(name = "ca_img")
    String caImg;

    /** */
    @Column(name = "place_id")
    Integer placeId;

    /** */
    @Column(name = "pr_message")
    String prMessage;

    /** */
    @Column(name = "max_flg")
    Integer maxFlg;

    @Column(name = "ca_company_place")
    Integer caCompanyPlace;

    @Column(name = "ca_company_url")
    Integer caCompanyUrl;

    @Column(name = "phone_number")
    Integer phoneNumber;

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
     * Returns the caName.
     * 
     * @return the caName
     */
    public String getCaName() {
        return caName;
    }

    /** 
     * Sets the caName.
     * 
     * @param caName the caName
     */
    public void setCaName(String caName) {
        this.caName = caName;
    }

    /** 
     * Returns the genderId.
     * 
     * @return the genderId
     */
    public Integer getGenderId() {
        return genderId;
    }

    /** 
     * Sets the genderId.
     * 
     * @param genderId the genderId
     */
    public void setGenderId(Integer genderId) {
        this.genderId = genderId;
    }

    /** 
     * Returns the caCompany.
     * 
     * @return the caCompany
     */
    public String getCaCompany() {
        return caCompany;
    }

    /** 
     * Sets the caCompany.
     * 
     * @param caCompany the caCompany
     */
    public void setCaCompany(String caCompany) {
        this.caCompany = caCompany;
    }

    /** 
     * Returns the caImg.
     * 
     * @return the caImg
     */
    public String getCaImg() {
        return caImg;
    }

    /** 
     * Sets the caImg.
     * 
     * @param caImg the caImg
     */
    public void setCaImg(String caImg) {
        this.caImg = caImg;
    }

    /** 
     * Returns the placeId.
     * 
     * @return the placeId
     */
    public Integer getPlaceId() {
        return placeId;
    }

    /** 
     * Sets the placeId.
     * 
     * @param placeId the placeId
     */
    public void setPlaceId(Integer placeId) {
        this.placeId = placeId;
    }

    /** 
     * Returns the prMessage.
     * 
     * @return the prMessage
     */
    public String getPrMessage() {
        return prMessage;
    }

    /** 
     * Sets the prMessage.
     * 
     * @param prMessage the prMessage
     */
    public void setPrMessage(String prMessage) {
        this.prMessage = prMessage;
    }

    /** 
     * Returns the maxFlg.
     * 
     * @return the maxFlg
     */
    public Integer getMaxFlg() {
        return maxFlg;
    }

    /** 
     * Sets the maxFlg.
     * 
     * @param maxFlg the maxFlg
     */
    public void setMaxFlg(Integer maxFlg) {
        this.maxFlg = maxFlg;
    }
}