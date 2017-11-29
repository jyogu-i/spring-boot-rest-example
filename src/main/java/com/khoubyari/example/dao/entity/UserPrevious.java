package com.khoubyari.example.dao.entity;

import org.seasar.doma.*;

/**
 */
@Entity
@Table(name = "user_previous")
public class UserPrevious {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Column(name = "industry_id")
    String industryId;

    public Integer getPreviousId() {
        return previousId;
    }

    public void setPreviousId(Integer previousId) {
        this.previousId = previousId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getJoinedYear() {
        return joinedYear;
    }

    public void setJoinedYear(Integer joinedYear) {
        this.joinedYear = joinedYear;
    }

    public String getJobCategoryId() {
        return jobCategoryId;
    }

    public void setJobCategoryId(String jobCategoryId) {
        this.jobCategoryId = jobCategoryId;
    }

    public String getIndustryId() {
        return industryId;
    }

    public void setIndustryId(String industryId) {
        this.industryId = industryId;
    }
}