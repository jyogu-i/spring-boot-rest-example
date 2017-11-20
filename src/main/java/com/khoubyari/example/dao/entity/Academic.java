package com.khoubyari.example.dao.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "academic")
public class Academic {

    /** */
    @Id
    @Column(name = "academic_id")
    String academicId;

    /** */
    @Column(name = "academic")
    String academic;

    /** 
     * Returns the academicId.
     * 
     * @return the academicId
     */
    public String getAcademicId() {
        return academicId;
    }

    /** 
     * Sets the academicId.
     * 
     * @param academicId the academicId
     */
    public void setAcademicId(String academicId) {
        this.academicId = academicId;
    }

    /** 
     * Returns the academic.
     * 
     * @return the academic
     */
    public String getAcademic() {
        return academic;
    }

    /** 
     * Sets the academic.
     * 
     * @param academic the academic
     */
    public void setAcademic(String academic) {
        this.academic = academic;
    }
}