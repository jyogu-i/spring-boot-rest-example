package com.khoubyari.example.repository;


import com.khoubyari.example.annotation.ConfigAutoDefault;
import com.khoubyari.example.dao.entity.Ca;
import com.khoubyari.example.dao.entity.JobCategory;
import com.khoubyari.example.dao.entity.UserHope;
import com.khoubyari.example.dao.entity.UserPrevious;
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
    JobCategory selectHJobCategory(UserHope userhope);

    @Select
    List<JobCategory> selectBig();

    @Select
    List<JobCategory> selectMiddle();

    @Select
    List<JobCategory> selectSmall();

}
