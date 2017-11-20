package net.mybrainlab.sync.naimono.dao;

import com.example.mshige1979.server.db.config.AppConfig;
import net.mybrainlab.sync.naimono.entity.Times;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface TimesDao {

    /**
     * @param timesId
     * @return the Times entity
     */
    @Select
    Times selectById(String timesId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Times entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Times entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Times entity);
}