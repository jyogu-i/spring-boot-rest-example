package com.khoubyari.example.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashMap;

/*
 *
 *
 */
@Entity
@Table(name = "user")
//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
public class User_previous implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    @Column(name = "previous_id")
    private String previous_id;

    @Column(name = "user_id")
    private String user_id;

    @Column(name = "p_company_name")
    private String p_company_name;

    @Column(name = "joined_year")
    private int joined_year;

    @Column(name = "p_job_category")
    private int p_job_category;


    public User_previous() {
    }

    public User_previous(String previous_id,String user_id, String p_company_name, int joined_year, int p_job_category) {
        this.previous_id = previous_id;
        this.user_id = user_id;
        this.p_company_name = p_company_name;
        this.joined_year = joined_year;
        this.p_job_category = p_job_category;
    }

    public String getPrevious_id() {
        return previous_id;
    }
    public void setPrevious_id(String previous_id) {
        this.previous_id = previous_id;
    }

    public String getUser_id() {
        return user_id;
    }
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public String getP_company_name() {
        return p_company_name;
    }

    public void setP_company_name(String p_company_namer) {
        this.p_company_name = p_company_name;
    }

    public int getJoined_year() {
        return joined_year;
    }

    public void setJoined_year(int joined_year) {
        this.joined_year = joined_year;
    }

    public int getP_job_category() {
        return p_job_category ;
    }

    public void setP_job_category(int p_job_category ) {
        this.p_job_category  = p_job_category ;
    }


    @Override
    public String toString() {
        return "user_id = " + this.user_id
                ;
    }
}
