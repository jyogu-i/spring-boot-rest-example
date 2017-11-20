package net.mybrainlab.sync.naimono.dao;

import com.example.mshige1979.server.db.config.AppConfig;
import net.mybrainlab.sync.naimono.entity.Major;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface MajorDao {

    /**
     * @param majorId
     * @return the Major entity
     */
    @Select
    Major selectById(String majorId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Major entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Major entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Major entity);
}