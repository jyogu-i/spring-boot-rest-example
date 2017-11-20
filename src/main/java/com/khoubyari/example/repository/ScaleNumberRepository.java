package com.khoubyari.example.repository;


import com.khoubyari.example.annotation.ConfigAutoDefault;
import com.khoubyari.example.dao.entity.Chat;
import com.khoubyari.example.dao.entity.ScaleNumber;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@ConfigAutoDefault
@Dao
public interface ScaleNumberRepository {
    @Select
    List<ScaleNumber> selectAll();

    @Select
    List<ScaleNumber> selectDetail(ScaleNumber scalenumber);

}
