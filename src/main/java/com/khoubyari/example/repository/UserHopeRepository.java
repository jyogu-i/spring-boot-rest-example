package com.khoubyari.example.repository;


import com.khoubyari.example.annotation.ConfigAutoDefault;
import com.khoubyari.example.dao.entity.UserHope;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@ConfigAutoDefault
@Dao
public interface UserHopeRepository {
    @Select
    List<UserHope> selectAll();

    @Select
    List<UserHope> selectUserHope(UserHope userhope);

    @Insert(sqlFile = true)
    int insertBasicUserHope(UserHope userhope);

    @Insert(sqlFile = true)
    int insertOptionUserHope(UserHope userhope);

    @Update(sqlFile = true)
    int updateOptionUserHope(UserHope userhope);

    @Update(sqlFile = true)
    int updateMyprofileUserHope(UserHope userhope);
}
