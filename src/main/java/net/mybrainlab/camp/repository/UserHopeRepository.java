package net.mybrainlab.camp.repository;

import net.mybrainlab.camp.annotation.ConfigAutoDefault;
import net.mybrainlab.camp.dao.entity.UserHope;
import net.mybrainlab.camp.dao.entity.UserPrevious;
import org.seasar.doma.*;

import java.util.List;

@ConfigAutoDefault
@Dao
public interface UserHopeRepository {
    @Select
    List<UserHope> selectAll();

    @Select
    List<UserHope> selectMyprofile(UserHope userhope);

    @Insert(sqlFile = true)
    int insert(UserHope userhope);

    @Insert(sqlFile = true)
    int insertBasicUserHope(UserHope userhope);

    @Insert(sqlFile = true)
    int insertOptionUserHope(UserHope userhope);

    @Update(sqlFile = true)
    int updateMyprofileUserHope(UserHope userhope);

    @Delete(sqlFile = true)
    int delete(UserHope userhope);
}
