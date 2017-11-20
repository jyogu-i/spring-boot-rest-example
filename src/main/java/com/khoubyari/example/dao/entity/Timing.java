package com.khoubyari.example.dao.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "timing")
public class Timing {

    /** */
    @Id
    @Column(name = "timing_id")
    String timingId;

    /** */
    @Column(name = "timing")
    String timing;

    /** 
     * Returns the timingId.
     * 
     * @return the timingId
     */
    public String getTimingId() {
        return timingId;
    }

    /** 
     * Sets the timingId.
     * 
     * @param timingId the timingId
     */
    public void setTimingId(String timingId) {
        this.timingId = timingId;
    }

    /** 
     * Returns the timing.
     * 
     * @return the timing
     */
    public String getTiming() {
        return timing;
    }

    /** 
     * Sets the timing.
     * 
     * @param timing the timing
     */
    public void setTiming(String timing) {
        this.timing = timing;
    }
}