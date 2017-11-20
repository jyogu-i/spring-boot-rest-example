package net.mybrainlab.sync.naimono.dao;

import com.example.mshige1979.server.db.config.AppConfig;
import net.mybrainlab.sync.naimono.entity.Chat;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface ChatDao {

    /**
     * @param chatId
     * @return the Chat entity
     */
    @Select
    Chat selectById(Integer chatId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Chat entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Chat entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Chat entity);
}