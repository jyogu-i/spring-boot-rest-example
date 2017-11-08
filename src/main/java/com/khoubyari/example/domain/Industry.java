package com.khoubyari.example.domain;

import javax.persistence.*;
import java.io.Serializable;

/*
 *
 *
 */
@Entity
@Table(name = "industry")
//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
public class Industry implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    @Column(name = "industry_id")
    private String industry_id;

    @Column(name = "industry")
    private String industry;


    public Industry() {
    }

    public Industry(String industry_id, String industry) {
        this.industry_id = industry_id;
        this.industry = industry;
    }
    public String getIndustry_id() {
        return industry_id;
    }

    public void setIndustry_id(String industry_id) {
        this.industry_id = industry_id;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @Override
    public String toString() {
        return "industry_id = " + this.industry_id;
    }
}
