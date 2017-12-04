package com.khoubyari.example.repository;


import com.amazonaws.services.dynamodbv2.xspec.L;
import com.khoubyari.example.annotation.ConfigAutoDefault;
import com.khoubyari.example.dao.entity.Ca;
import com.khoubyari.example.dao.entity.CaResultCompany;
import com.khoubyari.example.dao.entity.CaResultIndustry;
import com.khoubyari.example.dao.entity.Chat;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@ConfigAutoDefault
@Dao
public interface CaResultIndustryRepository {
    @Select
    List<CaResultIndustry> selectAll();

    @Select
    List<CaResultIndustry> selectDetail(CaResultIndustry caresultindustry);

    @Select
    CaResultIndustry selectCaList(Ca ca);

    @Select
    CaResultIndustry selectChat(Chat chat);

    @Select
   List<CaResultIndustry> selectCaChatList(Chat chat);

    @Select
    List<CaResultIndustry> selectCaListAll(Ca ca);

    @Insert
    @Transactional
    int insert(CaResultIndustry caresultindustry);

}
