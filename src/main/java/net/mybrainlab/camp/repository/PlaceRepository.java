package net.mybrainlab.camp.repository;


import net.mybrainlab.camp.annotation.ConfigAutoDefault;
import net.mybrainlab.camp.dao.entity.Ca;
import net.mybrainlab.camp.dao.entity.Place;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import java.util.List;

@ConfigAutoDefault
@Dao
public interface PlaceRepository {
    @Select
    List<Place> selectAll();

    @Select
    Place selectCaPlace(Ca ca);

}
