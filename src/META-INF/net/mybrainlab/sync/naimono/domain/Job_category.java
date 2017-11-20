package com.khoubyari.example.domain;

import javax.persistence.*;
import java.io.Serializable;

/*
 *
 *
 */
@Entity
@Table(name = "job_category")
//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
public class Job_category implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "job_category_id")
    private String job_category_id;

    @Column(name = "big_category")
    private String big_category;

    @Column(name = "middle_category")
    private String middle_category;

    @Column(name = "small_category")
    private String small_category;

    public Job_category() {
    }

    public Job_category(String job_category_id, String big_category, String middle_category, String small_category) {
        this.job_category_id = job_category_id;
        this.big_category = big_category;
        this.middle_category = middle_category;
        this.small_category = small_category;
    }

    public String getJob_category_id() {
        return job_category_id;
    }

    public void setJob_category_id(String job_category_id) {
        this.job_category_id = job_category_id;
    }

    public String getBig_category() {
        return big_category;
    }

    public void setBig_category(String big_category) {
        this.big_category = big_category;
    }

    public String getMiddle_category() {
        return middle_category;
    }

    public void setMiddle_category(String middle_category) {
        this.middle_category = middle_category;
    }

    public String getSmall_category() {
        return small_category;
    }

    public void setSmall_category(String small_category) {
        this.small_category = small_category;
    }

    @Override
    public String toString() {
        return "job_category_id = " + this.job_category_id;
    }
}
