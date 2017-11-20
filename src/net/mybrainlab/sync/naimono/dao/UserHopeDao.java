package net.mybrainlab.sync.naimono.dao;

import com.example.mshige1979.server.db.config.AppConfig;
import net.mybrainlab.sync.naimono.entity.UserHope;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface UserHopeDao {

    /**
     * @param userId
     * @return the UserHope entity
     */
    @Select
    UserHope selectById(String userId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(UserHope entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(UserHope entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(UserHope entity);
}