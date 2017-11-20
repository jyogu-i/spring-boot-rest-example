package net.mybrainlab.sync.naimono.dao;

import com.example.mshige1979.server.db.config.AppConfig;
import net.mybrainlab.sync.naimono.entity.Academic;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface AcademicDao {

    /**
     * @param academicId
     * @return the Academic entity
     */
    @Select
    Academic selectById(String academicId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Academic entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Academic entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Academic entity);
}