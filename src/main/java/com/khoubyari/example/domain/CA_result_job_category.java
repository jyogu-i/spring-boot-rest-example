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
public class CA_result_job_category implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    @Column(name = "result_job_category_id")
    private String result_job_category_id;

    @Column(name = "ca_id")
    private String ca_id;

    @Column(name = "jobcategory_id")
    private String job_category_id;

    @Column(name = "jobcategory_number")
    private int job_category_number;

    @Column(name = "jobcategory_closerate")
    private int job_category_closerate;

    @ManyToOne
    @JoinColumn(name = "ca", referencedColumnName = "ca_id")
    private CA ca;


    public CA_result_job_category() {
    }

    public CA_result_job_category(String result_job_category_id,String ca_id, String job_category_id,
                                  int job_category_number, int job_category_closerate) {
        this.result_job_category_id=result_job_category_id;
        this.ca_id = ca_id;
        this.job_category_id = job_category_id;
        this.job_category_number = job_category_number;
        this.job_category_closerate = job_category_closerate;
    }

    public String getResult_job_category_id() {
        return result_job_category_id;
    }
    public void setResult_job_category_id(String result_job_category_id) {
        this.result_job_category_id = result_job_category_id;
    }

    public String getCa_id() {
        return ca_id;
    }
    public void setCa_id(String ca_id) {
        this.ca_id = ca_id;
    }

    public String getJob_category_id() {
        return job_category_id;
    }

    public void setJob_category_id(String jobcategory_id) {
        this.job_category_id = jobcategory_id;
    }

    public int getJob_category_number() {
        return job_category_number;
    }

    public void setJob_category_number(int jobcategory_number) {
        this.job_category_number = jobcategory_number;
    }

    public int getJob_category_closerate() {
        return job_category_closerate;
    }

    public void setJob_category_closerate(int jobcategory_closerate) {
        this.job_category_closerate = jobcategory_closerate;
    }

    @Override
    public String toString() {
        return "ca_id = " + this.ca_id;
    }
}
