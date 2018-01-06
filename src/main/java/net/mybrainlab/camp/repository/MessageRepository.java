package net.mybrainlab.camp.repository;


import net.mybrainlab.camp.annotation.ConfigAutoDefault;
import net.mybrainlab.camp.dao.entity.Chat;
import net.mybrainlab.camp.dao.entity.Message;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;

import java.util.List;

@ConfigAutoDefault
@Dao
public interface MessageRepository {
    @Select
    Message selectLast(Chat chat);

    @Select
    List<Message> selectDetail(Message message);

    @Insert(sqlFile = true)
    int insert(Message message);
}
