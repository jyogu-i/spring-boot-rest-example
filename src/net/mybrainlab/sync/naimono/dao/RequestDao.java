package net.mybrainlab.sync.naimono.dao;

import com.example.mshige1979.server.db.config.AppConfig;
import net.mybrainlab.sync.naimono.entity.Request;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface RequestDao {

    /**
     * @param requesterId
     * @return the Request entity
     */
    @Select
    Request selectById(String requesterId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Request entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Request entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Request entity);
}