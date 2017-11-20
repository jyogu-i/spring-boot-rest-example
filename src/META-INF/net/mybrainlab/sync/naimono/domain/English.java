package com.khoubyari.example.domain;

import javax.persistence.*;
import java.io.Serializable;

/*
 *
 *
 */
@Entity
@Table(name = "english")
//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
public class English implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "english_id")
    private String english_id;

    @Column(name = "english")
    private String english;


    public English() {
    }

    public English(String english_id, String english) {
        this.english_id = english_id;
        this.english = english;
    }
    public String getEnglish_id() {
        return english_id;
    }

    public void setEnglish_id(String english_id) {
        this.english_id = english_id;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return "english_id = " + this.english_id;
    }
}
