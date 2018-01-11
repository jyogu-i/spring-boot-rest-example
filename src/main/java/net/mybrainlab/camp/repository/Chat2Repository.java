package net.mybrainlab.camp.repository;


import net.mybrainlab.camp.annotation.ConfigAutoDefault;
import net.mybrainlab.camp.dao.entity.Chat2;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import java.util.List;

@ConfigAutoDefault
@Dao
public interface Chat2Repository {
    @Select
    List<Chat2> selectCaList(Chat2 chat);

    @Select
    List<Chat2> selectApproval(Chat2 chat);

    @Insert(sqlFile = true)
    int insert(Chat2 chat);

    @Update(sqlFile = true)
    int updatePermission(Chat2 chat);

    @Update(sqlFile = true)
    int updateDenial(Chat2 chat);

}
