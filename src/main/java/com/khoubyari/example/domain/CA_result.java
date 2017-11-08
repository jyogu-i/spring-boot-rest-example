package com.khoubyari.example.domain;

import javax.persistence.*;
import java.io.Serializable;
import javax.persistence.ManyToOne;

/*
 *
 *
 */
@Entity
@Table(name = "ca_result")
//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
public class CA_result implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    @JoinColumn(name = "ca_id")
    private String ca_id;

    @Column(name = "company_id")
    private String company_id;

    @Column(name = "company_number")
    private int company_number;

    @Column(name = "industry_id")
    private String industry_id;

    @Column(name = "industry_number")
    private int industry_number;

    @Column(name = "industry_closerate")
    private int industry_closerate;

    @Column(name = "jobcategory_id")
    private String jobcategory_id;

    @Column(name = "jobcategory_number")
    private int jobcategory_number;

    @Column(name = "jobcategory_closerate")
    private int jobcategory_closerate;

    @ManyToOne
    @JoinColumn(name = "ca", referencedColumnName = "ca_id")
    private CA ca;


    public CA_result() {
    }

    public CA_result(String ca_id, String company_id, int company_number, String industry_id,
                     int industry_number, int industry_closerate, String jobcategory_id,
                     int jobcategory_number, int jobcategory_closerate) {
        this.ca_id = ca_id;
        this.company_id = company_id;
        this.company_number = company_number;
        this.industry_id = industry_id;
        this.industry_number = industry_number;
        this.industry_closerate = industry_closerate;
        this.jobcategory_id = jobcategory_id;
        this.jobcategory_number = jobcategory_number;
        this.jobcategory_closerate = jobcategory_closerate;
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

    public String getJobcategory_id() {
        return jobcategory_id;
    }

    public void setJobcategory_id(String jobcategory_id) {
        this.jobcategory_id = jobcategory_id;
    }

    public int getJobcategory_number() {
        return jobcategory_number;
    }

    public void setJobcategory_number(int jobcategory_number) {
        this.jobcategory_number = jobcategory_number;
    }

    public int getJobcategory_closerate() {
        return jobcategory_closerate;
    }

    public void setJobcategory_closerate(int jobcategory_closerate) {
        this.jobcategory_closerate = jobcategory_closerate;
    }

    @Override
    public String toString() {
        return "ca_id = " + this.ca_id;
    }
}
