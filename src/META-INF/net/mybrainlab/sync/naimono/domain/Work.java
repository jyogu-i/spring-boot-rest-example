package com.khoubyari.example.domain;

import javax.persistence.*;
import java.io.Serializable;

/*
 *
 *
 */
@Entity
@Table(name = "work")
//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
public class Work implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "work_id")
    private String work_id;

    @Column(name = "work")
    private String work;


    public Work() {
    }

    public Work(String work_id, String work) {
        this.work_id = work_id;
        this.work = work;
    }
    public String getWork_id() {
        return work_id;
    }

    public void setWork_id(String work_id) {
        this.work_id = work_id;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "work_id = " + this.work_id;
    }
}
