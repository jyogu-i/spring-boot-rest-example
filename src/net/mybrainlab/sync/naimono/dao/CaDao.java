package net.mybrainlab.sync.naimono.dao;

import com.example.mshige1979.server.db.config.AppConfig;
import net.mybrainlab.sync.naimono.entity.Ca;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface CaDao {

    /**
     * @param caId
     * @return the Ca entity
     */
    @Select
    Ca selectById(String caId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Ca entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Ca entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Ca entity);
}