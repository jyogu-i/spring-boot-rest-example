package com.khoubyari.example.dao.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "ca_result_company")
public class CaResultCompany {

    /** */
    @Id
    @Column(name = "result_company")
    Integer resultCompany;

    /** */
    @Column(name = "company_name")
    String companyName;

    /** */
    @Column(name = "ca_id")
    String caId;

    /** */
    @Column(name = "company_number")
    Integer companyNumber;

    /** 
     * Returns the resultCompany.
     * 
     * @return the resultCompany
     */
    public Integer getResultCompany() {
        return resultCompany;
    }

    public void setResultCompany(Integer resultCompany) {
        this.resultCompany = resultCompany;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCaId() {
        return caId;
    }

    public void setCaId(String caId) {
        this.caId = caId;
    }

    public Integer getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(Integer companyNumber) {
        this.companyNumber = companyNumber;
    }
}