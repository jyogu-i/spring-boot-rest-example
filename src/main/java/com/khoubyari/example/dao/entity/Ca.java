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
    String caCompanyPlace;

    @Column(name = "ca_company_url")
    String caCompanyUrl;

    @Column(name = "phone_number")
    String phoneNumber;

    @Column(name = "ca_yomigana")
    String caYomigana;

    @Column(name = "intro_message")
    String introMessage;

    public String getCaId() {
        return caId;
    }

    public void setCaId(String caId) {
        this.caId = caId;
    }

    public String getCaName() {
        return caName;
    }

    public void setCaName(String caName) {
        this.caName = caName;
    }

    public Integer getGenderId() {
        return genderId;
    }

    public void setGenderId(Integer genderId) {
        this.genderId = genderId;
    }

    public String getCaCompany() {
        return caCompany;
    }

    public void setCaCompany(String caCompany) {
        this.caCompany = caCompany;
    }

    public String getCaImg() {
        return caImg;
    }

    public void setCaImg(String caImg) {
        this.caImg = caImg;
    }

    public Integer getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Integer placeId) {
        this.placeId = placeId;
    }

    public String getPrMessage() {
        return prMessage;
    }

    public void setPrMessage(String prMessage) {
        this.prMessage = prMessage;
    }

    public Integer getMaxFlg() {
        return maxFlg;
    }

    public void setMaxFlg(Integer maxFlg) {
        this.maxFlg = maxFlg;
    }

    public String getCaCompanyPlace() {
        return caCompanyPlace;
    }

    public void setCaCompanyPlace(String caCompanyPlace) {
        this.caCompanyPlace = caCompanyPlace;
    }

    public String getCaCompanyUrl() {
        return caCompanyUrl;
    }

    public void setCaCompanyUrl(String caCompanyUrl) {
        this.caCompanyUrl = caCompanyUrl;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCaYomigana() {
        return caYomigana;
    }

    public void setCaYomigana(String caYomigana) {
        this.caYomigana = caYomigana;
    }

    public String getIntroMessage() {
        return introMessage;
    }

    public void setIntroMessag(String introMessage) {
        this.introMessage = introMessage;
    }
}