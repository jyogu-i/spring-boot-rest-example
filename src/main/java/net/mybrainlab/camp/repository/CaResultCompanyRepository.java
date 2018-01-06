package net.mybrainlab.camp.repository;


import net.mybrainlab.camp.annotation.ConfigAutoDefault;
import net.mybrainlab.camp.dao.entity.Ca;
import net.mybrainlab.camp.dao.entity.CaResultCompany;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@ConfigAutoDefault
@Dao
public interface CaResultCompanyRepository {

    @Select
    List<CaResultCompany> selectDetail(CaResultCompany caresultcompany);

    @Select
    List<CaResultCompany> selectCaListAll(Ca ca);

    @Insert
    @Transactional
    int insert(CaResultCompany caresultcompany);

}
