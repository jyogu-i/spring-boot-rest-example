package net.mybrainlab.camp.repository;

import net.mybrainlab.camp.annotation.ConfigAutoDefault;
import net.mybrainlab.camp.dao.entity.Timing;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import java.util.List;

@ConfigAutoDefault
@Dao
public interface TimingRepository {
    @Select
    List<Timing> selectAll();

}
