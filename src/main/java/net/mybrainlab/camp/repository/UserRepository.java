package net.mybrainlab.camp.repository;

import net.mybrainlab.camp.annotation.ConfigAutoDefault;
import net.mybrainlab.camp.dao.entity.AllUerInfo;
import net.mybrainlab.camp.dao.entity.Myprofile;
import net.mybrainlab.camp.dao.entity.User;
import net.mybrainlab.camp.dao.entity.Chat;
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

    @Select
    User selectMailPass(User user);

    @Select
    AllUerInfo selectMyprofile(Chat chat);

    @Select
    User selectCheckMail(User user);

    @Select
    User selectCheckAccountDo(User user);

    @Select
    User selectCheckToken(User user);

    @Select
    User selectByUserId(String userId);

    @Select
    User selectAccountByMail(String mail);

    @Insert(sqlFile = true)
    int insert(User user);

    @Insert(sqlFile = true)
    int insertAccount(User user);

    @Insert(sqlFile = true)
    int insertBasicUser(User user);

    @Insert(sqlFile = true)
    int insertOptionUser(User user);

    @Update(sqlFile = true)
    int updateMyprofileUser(User user);

    @Update(sqlFile = true)
    int updateMailAccount(User user);

    @Update(sqlFile = true)
    int updateAllAccount(User user);

    @Update(sqlFile = true)
    int updateLeave(User user);

    @Update(sqlFile = true)
    int updateToken(User user);

    @Update(sqlFile = true)
    int updateMailCheck(User user);

    @Update(sqlFile = true)
    int updateOption(User user);
}

