package net.mybrainlab.camp.dao.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "Scale_type")
public class ScaleType {

    /** */
    @Id
    @Column(name = "scale_type_id")
    String scaleTypeId;

    /** */
    @Column(name = "scale_type")
    String scaleType;

    public String getScaleTypeId() {
        return scaleTypeId;
    }

    public void setScaleTypeId(String scaleTypeId) {
        this.scaleTypeId = scaleTypeId;
    }

    public String getScaleType() {
        return scaleType;
    }

    public void setScaleType(String scaleType) {
        this.scaleType = scaleType;
    }
}