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
public class CA_result_industry implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "result_industry_id")
    private String result_industry_id;

    @Column(name = "ca_id")
    private String ca_id;

    @Column(name = "industry_id")
    private String industry_id;

    @Column(name = "industry_number")
    private int industry_number;

    @Column(name = "industry_closerate")
    private int industry_closerate;

    @ManyToOne
    @JoinColumn(name = "ca", referencedColumnName = "ca_id")
    private CA ca;


    public CA_result_industry() {
    }

    public CA_result_industry(String ca_id, String result_industry_id,String industry_id,
                              int industry_number, int industry_closerate) {
        this.result_industry_id=result_industry_id;
        this.ca_id = ca_id;
        this.industry_id = industry_id;
        this.industry_number = industry_number;
        this.industry_closerate = industry_closerate;
    }

    public String getResult_industry_id() {
        return result_industry_id;
    }
    public void setResult_industry_id(String result_industry_id) {
        this.result_industry_id = result_industry_id;
    }

    public String getCa_id() {
        return ca_id;
    }
    public void setCa_id(String ca_id) {
        this.ca_id = ca_id;
    }

    public String getIndustry_id() {
        return industry_id;
    }

    public void setIndustry_id(String industry_id) {
        this.industry_id = industry_id;
    }

    public int getIndustry_number() {
        return industry_number;
    }

    public void setIndustry_number(int industry_number) {
        this.industry_number = industry_number;
    }

    public int getIndustry_closerate() {
        return industry_closerate;
    }

    public void setIndustry_closerate(int industry_closerate) {
        this.industry_closerate = industry_closerate;
    }



    @Override
    public String toString() {
        return "ca_id = " + this.ca_id;
    }
}
