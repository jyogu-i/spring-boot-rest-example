package com.khoubyari.example.repository;


import com.khoubyari.example.annotation.ConfigAutoDefault;
import com.khoubyari.example.dao.entity.ScaleType;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import java.util.List;

@ConfigAutoDefault
@Dao
public interface ScaleTypeRepository {
    @Select
    List<ScaleType> selectAll();

    @Select
    List<ScaleType> selectDetail(ScaleType scaletype);
    
}
