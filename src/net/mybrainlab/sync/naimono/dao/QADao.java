package net.mybrainlab.sync.naimono.dao;

import com.example.mshige1979.server.db.config.AppConfig;
import net.mybrainlab.sync.naimono.entity.QA;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface QADao {

    /**
     * @param qAId
     * @return the QA entity
     */
    @Select
    QA selectById(String qAId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(QA entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(QA entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(QA entity);
}