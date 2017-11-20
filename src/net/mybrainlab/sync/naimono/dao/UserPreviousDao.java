package net.mybrainlab.sync.naimono.dao;

import com.example.mshige1979.server.db.config.AppConfig;
import net.mybrainlab.sync.naimono.entity.UserPrevious;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface UserPreviousDao {

    /**
     * @param previousId
     * @return the UserPrevious entity
     */
    @Select
    UserPrevious selectById(Integer previousId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(UserPrevious entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(UserPrevious entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(UserPrevious entity);
}