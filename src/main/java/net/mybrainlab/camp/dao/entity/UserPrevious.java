package net.mybrainlab.camp.dao.entity;

import lombok.Data;
import org.seasar.doma.*;

/**
 */
@Entity
@Table(name = "user_previous")
@Data
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
    String joinedYear;

    /** */
    @Column(name = "leaving_year")
    String leavingYear;

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

}