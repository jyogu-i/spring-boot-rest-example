package com.khoubyari.example.repository;


import com.khoubyari.example.annotation.ConfigAutoDefault;
import com.khoubyari.example.dao.entity.*;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@ConfigAutoDefault
@Dao
public interface JobCategoryRepository {
    @Select
    JobCategory selectJobCategory(UserPrevious userprevious);

    @Select
    JobCategory select(UserHope userHope);

    @Select
    JobCategory selectCaJobCategory(CaResultJobCategory caresultjobcategory);

    @Select
    List<JobCategory> selectPMyprofile(UserPrevious userprevious);

    @Select
    List<JobCategory> selectHMyprofile(UserHope userHope);

    @Select
    List<JobCategory> selectBig();

    @Select
    List<JobCategory> selectMiddle();

    @Select
    List<JobCategory> selectSmall();

}
