package net.mybrainlab.camp.repository;


import net.mybrainlab.camp.annotation.ConfigAutoDefault;
import net.mybrainlab.camp.dao.entity.ScaleType;
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
