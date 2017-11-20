package net.mybrainlab.sync.naimono.dao;

import com.example.mshige1979.server.db.config.AppConfig;
import net.mybrainlab.sync.naimono.entity.CaResultJobCategory;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface CaResultJobCategoryDao {

    /**
     * @param resultJobCategoryId
     * @return the CaResultJobCategory entity
     */
    @Select
    CaResultJobCategory selectById(Integer resultJobCategoryId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(CaResultJobCategory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(CaResultJobCategory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(CaResultJobCategory entity);
}