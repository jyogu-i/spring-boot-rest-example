package com.khoubyari.example.repository;


import com.khoubyari.example.annotation.ConfigAutoDefault;
import com.khoubyari.example.dao.entity.User;import com.khoubyari.example.dao.entity.UserHope;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@ConfigAutoDefault
@Dao
public interface UserRepository {

    @Select
    List<User> selectUser(User user);

    @Select
    User selectAccount(User user);

    @Insert(sqlFile = true)
    int insert(User user);

    @Insert(sqlFile = true)
    int insertBasicUser(User user);

    @Insert(sqlFile = true)
    int insertOptionUser(User user);

    @Update(sqlFile = true)
    int updateMyprofileUser(User user);

    @Update(sqlFile = true)
    int updateAccount(User user);
}
