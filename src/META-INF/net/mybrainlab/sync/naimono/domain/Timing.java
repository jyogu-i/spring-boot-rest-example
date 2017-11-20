package com.khoubyari.example.domain;

import javax.persistence.*;
import java.io.Serializable;

/*
 *
 *
 */
@Entity
@Table(name = "timing")
//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
public class Timing implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "timing_id")
    private String timing_id;

    @Column(name = "timing")
    private String timing;


    public Timing() {
    }

    public Timing(String timing_id, String timing) {
        this.timing_id = timing_id;
        this.timing = timing;
    }
    public String getTiming_id() {
        return timing_id;
    }

    public void setTiming_id(String timing_id) {
        this.timing_id = timing_id;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    @Override
    public String toString() {
        return "timing_id = " + this.timing_id;
    }
}
