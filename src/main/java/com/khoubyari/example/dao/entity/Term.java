package com.khoubyari.example.dao.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "term")
public class Term {

    /** */
    @Id
    @Column(name = "term_id")
    String termId;

    /** */
    @Column(name = "term")
    String term;

    /** 
     * Returns the termId.
     * 
     * @return the termId
     */
    public String getTermId() {
        return termId;
    }

    /** 
     * Sets the termId.
     * 
     * @param termId the termId
     */
    public void setTermId(String termId) {
        this.termId = termId;
    }

    /** 
     * Returns the term.
     * 
     * @return the term
     */
    public String getTerm() {
        return term;
    }

    /** 
     * Sets the term.
     * 
     * @param term the term
     */
    public void setTerm(String term) {
        this.term = term;
    }
}