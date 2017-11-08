package com.khoubyari.example.domain;

import javax.persistence.*;
import java.io.Serializable;

/*
 *
 *
 */
@Entity
@Table(name = "major")
//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
public class Major implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    @Column(name = "major_id")
    private String major_id;

    @Column(name = "major")
    private String major;


    public Major() {
    }

    public Major(String major_id, String major) {
        this.major_id = major_id;
        this.major = major;
    }
    public String getMajor_id() {
        return major_id;
    }

    public void setMajor_id(String major_id) {
        this.major_id = major_id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "major_id = " + this.major_id;
    }
}
