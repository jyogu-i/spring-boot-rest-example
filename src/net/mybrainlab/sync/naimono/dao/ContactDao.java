package net.mybrainlab.sync.naimono.dao;

import com.example.mshige1979.server.db.config.AppConfig;
import net.mybrainlab.sync.naimono.entity.Contact;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface ContactDao {

    /**
     * @param contactId
     * @return the Contact entity
     */
    @Select
    Contact selectById(Integer contactId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Contact entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Contact entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Contact entity);
}