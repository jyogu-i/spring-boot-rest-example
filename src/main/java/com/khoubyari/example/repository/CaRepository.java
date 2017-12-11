package com.khoubyari.example.repository;


import com.khoubyari.example.annotation.ConfigAutoDefault;
import com.khoubyari.example.dao.entity.Ca;
import com.khoubyari.example.dao.entity.Chat;
import com.khoubyari.example.dao.entity.User;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@ConfigAutoDefault
@Dao
public interface CaRepository {
    @Select
    Ca selectDetail(Ca ca);

    @Select
    List<Ca> selectCaLists(Chat chat);

    @Insert
    @Transactional
    int insert(Ca ca);

}
