package com.khoubyari.example.domain;

import javax.persistence.*;
import java.io.Serializable;

/*
 *
 *
 */
@Entity
@Table(name = "place")
//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
public class Place implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    @Column(name = "place_id")
    private String place_id;

    @Column(name = "place")
    private String place;


    public Place() {
    }

    public Place(String place_id, String place) {
        this.place_id = place_id;
        this.place = place;
    }
    public String getPlace_id() {
        return place_id;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "place_id = " + this.place_id;
    }
}
