package com.khoubyari.example.dao.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Option {

    String userId;

    String companyName;

    String placeId;

    Integer income;

    String scaleNumberId;

    String scaleTypeId;

    String workId;

    String skill;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public String getScaleNumberId() {
        return scaleNumberId;
    }

    public void setScaleNumberId(String scaleNumberId) {
        this.scaleNumberId = scaleNumberId;
    }

    public String getScaleTypeId() {
        return scaleTypeId;
    }

    public void setScaleTypeId(String scaleTypeId) {
        this.scaleTypeId = scaleTypeId;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}