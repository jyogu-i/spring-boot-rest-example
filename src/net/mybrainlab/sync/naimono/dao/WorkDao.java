package net.mybrainlab.sync.naimono.dao;

import com.example.mshige1979.server.db.config.AppConfig;
import net.mybrainlab.sync.naimono.entity.Work;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface WorkDao {

    /**
     * @param workId
     * @return the Work entity
     */
    @Select
    Work selectById(String workId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Work entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Work entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Work entity);
}