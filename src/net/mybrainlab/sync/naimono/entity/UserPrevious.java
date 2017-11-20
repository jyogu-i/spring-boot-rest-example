package net.mybrainlab.sync.naimono.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = UserPreviousListener.class)
@Table(name = "user_previous")
public class UserPrevious {

    /** */
    @Id
    @Column(name = "previous_id")
    Integer previousId;

    /** */
    @Column(name = "user_id")
    String userId;

    /** */
    @Column(name = "company_name")
    String companyName;

    /** */
    @Column(name = "joined_year")
    Integer joinedYear;

    /** */
    @Column(name = "job_category_id")
    String jobCategoryId;

    /** 
     * Returns the previousId.
     * 
     * @return the previousId
     */
    public Integer getPreviousId() {
        return previousId;
    }

    /** 
     * Sets the previousId.
     * 
     * @param previousId the previousId
     */
    public void setPreviousId(Integer previousId) {
        this.previousId = previousId;
    }

    /** 
     * Returns the userId.
     * 
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /** 
     * Sets the userId.
     * 
     * @param userId the userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /** 
     * Returns the companyName.
     * 
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /** 
     * Sets the companyName.
     * 
     * @param companyName the companyName
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /** 
     * Returns the joinedYear.
     * 
     * @return the joinedYear
     */
    public Integer getJoinedYear() {
        return joinedYear;
    }

    /** 
     * Sets the joinedYear.
     * 
     * @param joinedYear the joinedYear
     */
    public void setJoinedYear(Integer joinedYear) {
        this.joinedYear = joinedYear;
    }

    /** 
     * Returns the jobCategoryId.
     * 
     * @return the jobCategoryId
     */
    public String getJobCategoryId() {
        return jobCategoryId;
    }

    /** 
     * Sets the jobCategoryId.
     * 
     * @param jobCategoryId the jobCategoryId
     */
    public void setJobCategoryId(String jobCategoryId) {
        this.jobCategoryId = jobCategoryId;
    }
}