package net.mybrainlab.camp.repository;


import net.mybrainlab.camp.annotation.ConfigAutoDefault;
import net.mybrainlab.camp.dao.entity.JobCategory;
import net.mybrainlab.camp.dao.entity.UserHope;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import java.util.List;

@ConfigAutoDefault
@Dao
public interface JobCategoryRepository {
    @Select
    JobCategory select(UserHope userHope);

    @Select
    List<JobCategory> selectBig();

    @Select
    List<JobCategory> selectMiddle();

    @Select
    List<JobCategory> selectSmall();

}
