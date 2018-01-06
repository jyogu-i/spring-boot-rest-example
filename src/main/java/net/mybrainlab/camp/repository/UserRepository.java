package net.mybrainlab.camp.repository;

import net.mybrainlab.camp.annotation.ConfigAutoDefault;
import net.mybrainlab.camp.dao.entity.User;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

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

    @Update(sqlFile = true)
    int updateLeave(User user);
}
