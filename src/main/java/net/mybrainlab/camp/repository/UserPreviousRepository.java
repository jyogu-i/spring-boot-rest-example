package net.mybrainlab.camp.repository;

import net.mybrainlab.camp.annotation.ConfigAutoDefault;
import net.mybrainlab.camp.dao.entity.UserPrevious;
import org.seasar.doma.*;

import java.util.List;

@ConfigAutoDefault
@Dao
public interface UserPreviousRepository {
    @Select
    List<UserPrevious> selectAll();

    @Select
    List<UserPrevious> selectMyprofile(UserPrevious userprevious);

    @Insert(sqlFile = true)
    int insert(UserPrevious userprevious);

    @Insert(sqlFile = true)
    int insertBasicUserPrevious(UserPrevious userprevious);

    @Insert(sqlFile = true)
    int insertOptionUserPrevious(UserPrevious userprevious);

    @Delete(sqlFile = true)
    int delete(UserPrevious userprevious);

}
