package com.khoubyari.example.domain;

import javax.persistence.*;
import java.io.Serializable;

/*
 *
 *
 */
@Entity
@Table(name = "times")
//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
public class Times implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    @Column(name = "times_id")
    private String times_id;

    @Column(name = "times")
    private String times;


    public Times() {
    }

    public Times(String times_id, String times) {
        this.times_id = times_id;
        this.times = times;
    }
    public String getTimes_id() {
        return times_id;
    }

    public void setTimes_id(String times_id) {
        this.times_id = times_id;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    @Override
    public String toString() {
        return "times_id = " + this.times_id;
    }
}
