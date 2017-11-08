package com.khoubyari.example.domain;

import javax.persistence.*;
import java.io.Serializable;

/*
 *
 *
 */
@Entity
@Table(name = "term")
//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
public class Term implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    @Column(name = "term_id")
    private String term_id;

    @Column(name = "term")
    private String term;


    public Term() {
    }

    public Term(String term_id, String term) {
        this.term_id = term_id;
        this.term = term;
    }
    public String getTerm_id() {
        return term_id;
    }

    public void setTerm_id(String term_id) {
        this.term_id = term_id;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    @Override
    public String toString() {
        return "term_id = " + this.term_id;
    }
}
