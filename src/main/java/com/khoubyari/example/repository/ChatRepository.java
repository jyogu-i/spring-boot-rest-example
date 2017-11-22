package com.khoubyari.example.repository;


import com.khoubyari.example.annotation.ConfigAutoDefault;
import com.khoubyari.example.dao.entity.Academic;
import com.khoubyari.example.dao.entity.Ca;
import com.khoubyari.example.dao.entity.Chat;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.springframework.transaction.annotation.Transactional;

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
}
