package net.mybrainlab.sync.naimono.dao;

import com.example.mshige1979.server.db.config.AppConfig;
import net.mybrainlab.sync.naimono.entity.Term;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface TermDao {

    /**
     * @param termId
     * @return the Term entity
     */
    @Select
    Term selectById(String termId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Term entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Term entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Term entity);
}