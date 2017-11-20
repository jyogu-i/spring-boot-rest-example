package net.mybrainlab.sync.naimono.dao;

import com.example.mshige1979.server.db.config.AppConfig;
import net.mybrainlab.sync.naimono.entity.Place;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface PlaceDao {

    /**
     * @param placeId
     * @return the Place entity
     */
    @Select
    Place selectById(String placeId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Place entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Place entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Place entity);
}