package net.mybrainlab.camp.repository;

import net.mybrainlab.camp.annotation.ConfigAutoDefault;
import net.mybrainlab.camp.dao.entity.Chat;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import java.util.List;

@ConfigAutoDefault
@Dao
public interface ChatRepository {
    @Select
    List<Chat> selectAll();

    @Select
    List<Chat> selectCaList(Chat chat);

    @Select
    List<Chat> selectApproval(Chat chat);

    @Insert(sqlFile = true)
    int insert(Chat chat);

    @Update(sqlFile = true)
    int updatePermission(Chat chat);

    @Update(sqlFile = true)
    int updateDenial(Chat chat);

}
