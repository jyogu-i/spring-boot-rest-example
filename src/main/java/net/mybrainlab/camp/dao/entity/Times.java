package net.mybrainlab.camp.dao.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "times")
public class Times {

    /** */
    @Id
    @Column(name = "times_id")
    String timesId;

    /** */
    @Column(name = "times")
    String times;

    /** 
     * Returns the timesId.
     * 
     * @return the timesId
     */
    public String getTimesId() {
        return timesId;
    }

    /** 
     * Sets the timesId.
     * 
     * @param timesId the timesId
     */
    public void setTimesId(String timesId) {
        this.timesId = timesId;
    }

    /** 
     * Returns the times.
     * 
     * @return the times
     */
    public String getTimes() {
        return times;
    }

    /** 
     * Sets the times.
     * 
     * @param times the times
     */
    public void setTimes(String times) {
        this.times = times;
    }
}