package com.khoubyari.example.repository;


import com.khoubyari.example.annotation.ConfigAutoDefault;
import com.khoubyari.example.dao.entity.*;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@ConfigAutoDefault
@Dao
public interface IndustryRepository {

    @Select
    List<Industry> selectBig();

    @Select
    List<Industry> selectMiddle();

    @Select
    List<Industry> selectSmall();

}
