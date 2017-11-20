package net.mybrainlab.sync.naimono.dao;

import com.example.mshige1979.server.db.config.AppConfig;
import net.mybrainlab.sync.naimono.entity.Message;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface MessageDao {

    /**
     * @param messageId
     * @return the Message entity
     */
    @Select
    Message selectById(Integer messageId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Message entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Message entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Message entity);
}