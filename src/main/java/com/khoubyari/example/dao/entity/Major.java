package com.khoubyari.example.dao.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "major")
public class Major {

    /** */
    @Id
    @Column(name = "major_id")
    String majorId;

    /** */
    @Column(name = "major")
    String major;

    /** 
     * Returns the majorId.
     * 
     * @return the majorId
     */
    public String getMajorId() {
        return majorId;
    }

    /** 
     * Sets the majorId.
     * 
     * @param majorId the majorId
     */
    public void setMajorId(String majorId) {
        this.majorId = majorId;
    }

    /** 
     * Returns the major.
     * 
     * @return the major
     */
    public String getMajor() {
        return major;
    }

    /** 
     * Sets the major.
     * 
     * @param major the major
     */
    public void setMajor(String major) {
        this.major = major;
    }
}