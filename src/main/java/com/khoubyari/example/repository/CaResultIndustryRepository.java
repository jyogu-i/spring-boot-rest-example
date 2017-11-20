package com.khoubyari.example.repository;


import com.khoubyari.example.annotation.ConfigAutoDefault;
import com.khoubyari.example.dao.entity.CaResultCompany;
import com.khoubyari.example.dao.entity.CaResultIndustry;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@ConfigAutoDefault
@Dao
public interface CaResultIndustryRepository {
    @Select
    List<CaResultIndustry> selectAll();

    @Select
    List<CaResultIndustry> selectDetail(CaResultIndustry caresultindustry);

    @Insert
    @Transactional
    int insert(CaResultIndustry caresultindustry);

}
