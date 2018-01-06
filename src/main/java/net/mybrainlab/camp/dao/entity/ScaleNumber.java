package net.mybrainlab.camp.dao.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "Scale_number")
public class ScaleNumber {

    /** */
    @Id
    @Column(name = "scale_number_id")
    String scaleNumberId;

    /** */
    @Column(name = "scale_number")
    String scaleNumber;

    /** 
     * Returns the academicId.
     * 
     * @return the academicId
     */
    public String getScaleNumberId() {
        return scaleNumberId;
    }

    public void setScaleNumberId(String scaleNumberId) {
        this.scaleNumberId = scaleNumberId;
    }

    /** 
     * Returns the academic.
     * 
     * @return the academic
     */
    public String getScaleNumber() {
        return scaleNumber;
    }

    public void setScaleNumber(String scaleNumber) {
        this.scaleNumber = scaleNumber;
    }
}