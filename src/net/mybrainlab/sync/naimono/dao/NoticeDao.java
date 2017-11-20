package net.mybrainlab.sync.naimono.dao;

import com.example.mshige1979.server.db.config.AppConfig;
import net.mybrainlab.sync.naimono.entity.Notice;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface NoticeDao {

    /**
     * @param noticeId
     * @return the Notice entity
     */
    @Select
    Notice selectById(String noticeId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Notice entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Notice entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Notice entity);
}