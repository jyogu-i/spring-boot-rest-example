package net.mybrainlab.camp.repository;


import net.mybrainlab.camp.annotation.ConfigAutoDefault;
import net.mybrainlab.camp.dao.entity.ScaleNumber;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import java.util.List;

@ConfigAutoDefault
@Dao
public interface ScaleNumberRepository {
    @Select
    List<ScaleNumber> selectAll();

    @Select
    List<ScaleNumber> selectDetail(ScaleNumber scalenumber);

}
