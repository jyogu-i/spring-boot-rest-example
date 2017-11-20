package net.mybrainlab.sync.naimono.dao;

import com.example.mshige1979.server.db.config.AppConfig;
import net.mybrainlab.sync.naimono.entity.JobCategory;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface JobCategoryDao {

    /**
     * @param jobCategoryId
     * @return the JobCategory entity
     */
    @Select
    JobCategory selectById(String jobCategoryId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(JobCategory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(JobCategory entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(JobCategory entity);
}