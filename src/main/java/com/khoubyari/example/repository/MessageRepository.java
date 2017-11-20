package com.khoubyari.example.repository;


import com.khoubyari.example.annotation.ConfigAutoDefault;
import com.khoubyari.example.dao.entity.Chat;
import com.khoubyari.example.dao.entity.Message;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@ConfigAutoDefault
@Dao
public interface MessageRepository {
    @Select
    List<Message> selectAll();

    @Select
    List<Message> selectDetail(Message message);

    @Insert
    @Transactional
    int insert(Message message);
}
