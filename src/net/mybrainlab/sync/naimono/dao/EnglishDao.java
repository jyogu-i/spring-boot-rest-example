package net.mybrainlab.sync.naimono.dao;

import com.example.mshige1979.server.db.config.AppConfig;
import net.mybrainlab.sync.naimono.entity.English;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface EnglishDao {

    /**
     * @param englishId
     * @return the English entity
     */
    @Select
    English selectById(String englishId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(English entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(English entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(English entity);
}