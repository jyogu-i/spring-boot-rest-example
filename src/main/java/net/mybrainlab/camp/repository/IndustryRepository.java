package net.mybrainlab.camp.repository;

import net.mybrainlab.camp.annotation.ConfigAutoDefault;
import net.mybrainlab.camp.dao.entity.Industry;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import java.util.List;

@ConfigAutoDefault
@Dao
public interface IndustryRepository {

    @Select
    List<Industry> selectBig();

    @Select
    List<Industry> selectMiddle();

    @Select
    List<Industry> selectSmall();

}
