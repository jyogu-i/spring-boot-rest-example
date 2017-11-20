package com.khoubyari.example.repository;


import com.khoubyari.example.annotation.ConfigAutoDefault;
import com.khoubyari.example.dao.entity.Academic;
import com.khoubyari.example.dao.entity.PersonalInfo;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import java.util.List;

@ConfigAutoDefault
@Dao
public interface PersonalInfoRepository {
    @Select
    List<PersonalInfo> selectAll();
}
