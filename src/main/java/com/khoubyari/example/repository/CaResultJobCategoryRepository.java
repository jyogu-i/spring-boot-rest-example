package com.khoubyari.example.repository;


import com.khoubyari.example.annotation.ConfigAutoDefault;
import com.khoubyari.example.dao.entity.Ca;
import com.khoubyari.example.dao.entity.CaResultCompany;
import com.khoubyari.example.dao.entity.CaResultIndustry;
import com.khoubyari.example.dao.entity.CaResultJobCategory;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@ConfigAutoDefault
@Dao
public interface CaResultJobCategoryRepository {
    @Select
    List<CaResultJobCategory> selectAll();

    @Select
    List<CaResultJobCategory> selectDetail(CaResultJobCategory caresultjobcategory);

    @Select
    List<CaResultJobCategory> selectCaListAll(Ca ca);

    @Insert
    @Transactional
    int insert(CaResultJobCategory caresultjobcategory);

}
