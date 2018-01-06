package net.mybrainlab.camp.repository;


import net.mybrainlab.camp.annotation.ConfigAutoDefault;
import net.mybrainlab.camp.dao.entity.Ca;
import net.mybrainlab.camp.dao.entity.CaResultJobCategory;
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
