package com.khoubyari.example.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/*
 *
 *
 */
@Entity
@Table(name = "ca")
//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
public class CA implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    @Column(name = "ca_id")
    private String ca_id;

    @Column(name = "ca_name")
    private String ca_name;

    @Column(name = "gender_id")
    private int gender_id;

    @Column(name = "ca_company")
    private String ca_company;

    @Column(name = "ca_img")
    private String ca_img;

    @Column(name = "place_id")
    private int place_id;

    @Column(name = "pr_message")
    private String pr_message;

    @OneToMany(mappedBy = "ca", cascade = {CascadeType.ALL})
    @JoinColumn(name="ca_id")
    private List<CA_result_job_category> ca_results;

    public CA() {
    }

    public CA(String ca_id, String ca_name, int gender_id, String ca_company, String ca_img,
              int place_id, String pr_message) {
        this.ca_id = ca_id;
        this.ca_name = ca_name;
        this.gender_id = gender_id;
        this.ca_company = ca_company;
        this.ca_img =ca_img;
        this.place_id = place_id;
        this.pr_message = pr_message;

    }

    public String getCa_id() {
        return ca_id;
    }
    public void setCa_id(String ca_id) {
        this.ca_id = ca_id;
    }
    public int getCa_gender() {
        return gender_id;
    }

    public void setCa_gender(int ca_gender) {
        this.gender_id = gender_id;
    }

    public String getCa_name() {
        return ca_name;
    }

    public void setCa_name(String ca_name) {
        this.ca_name = ca_name;
    }

    public String getCa_company() {
        return ca_company;
    }

    public void setCa_company(String ca_company) {
        this.ca_company = ca_company;
    }

    public String getCa_img() {
        return ca_img;
    }

    public void setCa_img(String ca_img) {
        this.ca_img = ca_img;
    }

    public int getCa_place() {
        return place_id;
    }

    public void setCa_place(int ca_place) {
        this.place_id = place_id;
    }

    public String getPr_message() {
        return pr_message;
    }

    public void setPr_message(String pr_message) {
        this.pr_message = pr_message;
    }

    @Override
    public String toString() {
        return "ca_id = " + this.ca_id;
    }
}
