package net.mybrainlab.camp.dao.entity;

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
    @Column(name = "p_company_name")
    String companyName;

    /** */
    @Column(name = "joined_year")
    Integer joinedYear;

    /** */
    @Column(name = "p_job_category_id")
    String jobCategoryId;

    @Column(name = "p_industry_id")
    String industryId;

    /** */
    @Column(name = "big_category")
    String bigCategory;

    /** */
    @Column(name = "middle_category")
    String middleCategory;

    /** */
    @Column(name = "small_category")
    String smallCategory;

    @Column(name = "big_category_id")
    String bigCategoryId;

    /** */
    @Column(name = "middle_category_id")
    String middleCategoryId;

    /** */
    @Column(name = "small_category_id")
    String smallCategoryId;

    @Column(name = "big_industry")
    String bigIndustry;

    /** */
    @Column(name = "middle_industry")
    String middleIndustry;

    /** */
    @Column(name = "small_industry")
    String smallIndustry;

    /** */
    @Column(name = "big_industry_id")
    String bigIndustryId;

    /** */
    @Column(name = "middle_industry_id")
    String middleIndustryId;

    /** */
    @Column(name = "small_industry_id")
    String smallIndustryId;


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

    public String getBigCategory() {
        return bigCategory;
    }

    public void setBigCategory(String bigCategory) {
        this.bigCategory = bigCategory;
    }

    public String getMiddleCategory() {
        return middleCategory;
    }

    public void setMiddleCategory(String middleCategory) {
        this.middleCategory = middleCategory;
    }

    public String getSmallCategory() {
        return smallCategory;
    }

    public void setSmallCategory(String smallCategory) {
        this.smallCategory = smallCategory;
    }

    public String getBigCategoryId() {
        return bigCategoryId;
    }

    public void setBigCategoryId(String bigCategoryId) {
        this.bigCategoryId = bigCategoryId;
    }

    public void setMiddleCategoryId(String middleCategoryId) {
        this.middleCategoryId = middleCategoryId;
    }

    public String getMiddleCategoryId() {
        return middleCategoryId;
    }

    public String getSmallCategoryId() {
        return smallCategoryId;
    }

    public void setSmallCategoryId(String smallCategoryId) {
        this.smallCategoryId = smallCategoryId;
    }

    public String getBigIndustry() {
        return bigIndustry;
    }

    public void setBigIndustry(String bigIndustry) {
        this.bigIndustry = bigIndustry;
    }

    public String getMiddleIndustry() {
        return middleIndustry;
    }

    public void setMiddleIndustry(String middleIndustry) {
        this.middleIndustry = middleIndustry;
    }

    public String getSmallIndustry() {
        return smallIndustry;
    }

    public void setSmallIndustry(String smallIndustry) {
        this.smallIndustry = smallIndustry;
    }

    public String getBigIndustryId() {
        return bigIndustryId;
    }

    public void setBigIndustryId(String bigIndustryId) {
        this.bigIndustryId = bigIndustryId;
    }

    public String getMiddleIndustryId() {
        return middleIndustryId;
    }

    public void setMiddleIndustryId(String middleIndustryId) {
        this.middleIndustryId = middleIndustryId;
    }

    public String getSmallIndustryId() {
        return smallIndustryId;
    }

    public void setSmallIndustryId(String smallIndustryId) {
        this.smallIndustryId = smallIndustryId;
    }


}