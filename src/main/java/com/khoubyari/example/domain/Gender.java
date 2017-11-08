package com.khoubyari.example.domain;

import javax.persistence.*;
import java.io.Serializable;

/*
 *
 *
 */
@Entity
@Table(name = "gender")
//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
public class Gender implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    @Column(name = "gender_id")
    private String gender_id;

    @Column(name = "gender")
    private String gender;


    public Gender() {
    }

    public Gender(String gender_id, String gender) {
        this.gender_id = gender_id;
        this.gender = gender;
    }
    public String getGender_id() {
        return gender_id;
    }

    public void setGender_id(String gender_id) {
        this.gender_id = gender_id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "gender_id = " + this.gender_id;
    }
}
