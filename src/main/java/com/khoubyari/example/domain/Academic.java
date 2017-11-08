package com.khoubyari.example.domain;

import javax.persistence.*;
import java.io.Serializable;

/*
 *
 *
 */
@Entity
@Table(name = "academic")
//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
public class Academic implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    @Column(name = "academic_id")
    private String academic_id;

    @Column(name = "academic")
    private String academic;


    public Academic() {
    }

    public Academic(String academic_id, String academic) {
        this.academic_id = academic_id;
        this.academic = academic;
    }
    public String getAcademic_id() {
        return academic_id;
    }

    public void setAcademic_id(String academic_id) {
        this.academic_id = academic_id;
    }

    public String getAcademic() {
        return academic;
    }

    public void setAcademic(String academic) {
        this.academic = academic;
    }

    @Override
    public String toString() {
        return "gender_id = " + this.academic_id;
    }
}
