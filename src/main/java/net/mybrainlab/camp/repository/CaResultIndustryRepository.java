package net.mybrainlab.camp.repository;

import net.mybrainlab.camp.annotation.ConfigAutoDefault;
import net.mybrainlab.camp.dao.entity.Ca;
import net.mybrainlab.camp.dao.entity.CaResultIndustry;
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

    @Select
    List<CaResultIndustry> selectCaListAll(Ca ca);

    @Insert
    @Transactional
    int insert(CaResultIndustry caresultindustry);

}
