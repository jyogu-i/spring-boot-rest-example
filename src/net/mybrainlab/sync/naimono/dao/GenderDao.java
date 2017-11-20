package net.mybrainlab.sync.naimono.dao;

import com.example.mshige1979.server.db.config.AppConfig;
import net.mybrainlab.sync.naimono.entity.Gender;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface GenderDao {

    /**
     * @param genderId
     * @return the Gender entity
     */
    @Select
    Gender selectById(String genderId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Gender entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Gender entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Gender entity);
}