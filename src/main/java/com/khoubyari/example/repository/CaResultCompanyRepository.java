package com.khoubyari.example.repository;


import com.khoubyari.example.annotation.ConfigAutoDefault;
import com.khoubyari.example.dao.entity.Ca;
import com.khoubyari.example.dao.entity.CaResultCompany;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@ConfigAutoDefault
@Dao
public interface CaResultCompanyRepository {
    @Select
    List<CaResultCompany> selectAll();

    @Select
    List<CaResultCompany> selectDetail(CaResultCompany caresultcompany);

    @Select
    CaResultCompany selectCaList(Ca ca);

    @Select
    List<CaResultCompany> selectCaListAll(Ca ca);

    @Insert
    @Transactional
    int insert(CaResultCompany caresultcompany);

}
