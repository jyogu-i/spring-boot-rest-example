package net.mybrainlab.sync.naimono.dao;

import com.example.mshige1979.server.db.config.AppConfig;
import net.mybrainlab.sync.naimono.entity.Timing;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface TimingDao {

    /**
     * @param timingId
     * @return the Timing entity
     */
    @Select
    Timing selectById(String timingId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Timing entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Timing entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Timing entity);
}