package com.khoubyari.example.domain;

import javax.persistence.*;
import java.io.Serializable;

/*
 *
 *
 */
@Entity
@Table(name = "ca_result")
//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
public class CA_result_company implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    @Column(name = "result_company_id")
    private String result_company_id;

    @Column(name = "ca_id")
    private String ca_id;

    @Column(name = "company_id")
    private String company_id;

    @Column(name = "company_number")
    private int company_number;


    @ManyToOne
    @JoinColumn(name = "ca", referencedColumnName = "ca_id")
    private CA ca;


    public CA_result_company() {
    }

    public CA_result_company(String result_company_id, String ca_id, String company_id, int company_number, String industry_id) {
        this.result_company_id=result_company_id;
        this.ca_id = ca_id;
        this.company_id = company_id;
        this.company_number = company_number;
    }

    public String getResult_company_id() {
        return result_company_id;
    }
    public void setResult_company_id(String result_company_id) {
        this.ca_id = result_company_id;
    }

    public String getCa_id() {
        return ca_id;
    }
    public void setCa_id(String ca_id) {
        this.ca_id = ca_id;
    }

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    public int getCompany_number() {
        return company_number;
    }

    public void setCompany_number(int company_number) {
        this.company_number = company_number;
    }


    @Override
    public String toString() {
        return "ca_id = " + this.ca_id;
    }
}
