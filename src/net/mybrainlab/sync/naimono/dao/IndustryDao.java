package net.mybrainlab.sync.naimono.dao;

import com.example.mshige1979.server.db.config.AppConfig;
import net.mybrainlab.sync.naimono.entity.Industry;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface IndustryDao {

    /**
     * @param industryId
     * @return the Industry entity
     */
    @Select
    Industry selectById(String industryId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Industry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Industry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Industry entity);
}