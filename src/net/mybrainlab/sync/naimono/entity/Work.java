package net.mybrainlab.sync.naimono.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = WorkListener.class)
@Table(name = "work")
public class Work {

    /** */
    @Id
    @Column(name = "work_id")
    String workId;

    /** */
    @Column(name = "work")
    String work;

    /** 
     * Returns the workId.
     * 
     * @return the workId
     */
    public String getWorkId() {
        return workId;
    }

    /** 
     * Sets the workId.
     * 
     * @param workId the workId
     */
    public void setWorkId(String workId) {
        this.workId = workId;
    }

    /** 
     * Returns the work.
     * 
     * @return the work
     */
    public String getWork() {
        return work;
    }

    /** 
     * Sets the work.
     * 
     * @param work the work
     */
    public void setWork(String work) {
        this.work = work;
    }
}