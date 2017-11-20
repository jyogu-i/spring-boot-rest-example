package com.khoubyari.example.repository;


import com.khoubyari.example.annotation.ConfigAutoDefault;
import com.khoubyari.example.dao.entity.UserHope;
import com.khoubyari.example.dao.entity.UserPrevious;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@ConfigAutoDefault
@Dao
public interface UserPreviousRepository {
    @Select
    List<UserPrevious> selectAll();

    @Select
    List<UserPrevious> selectUserPrevious(UserPrevious userprevious);

    @Insert(sqlFile = true)
    int insertBasicUserPrevious(UserPrevious userprevious);

    @Insert(sqlFile = true)
    int insertOptionUserPrevious(UserPrevious userprevious);

    @Update(sqlFile = true)
    int updateMyprofileUserPrevious(UserPrevious userprevious);

//    @Insert
//    @Transactional
//    int insertBasicUserPrevious(UserPrevious userprevious);
}
