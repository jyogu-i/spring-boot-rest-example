package net.mybrainlab.sync.naimono.dao;

import com.example.mshige1979.server.db.config.AppConfig;
import net.mybrainlab.sync.naimono.entity.CaResultCompany;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface CaResultCompanyDao {

    /**
     * @param resultCompany
     * @return the CaResultCompany entity
     */
    @Select
    CaResultCompany selectById(Integer resultCompany);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(CaResultCompany entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(CaResultCompany entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(CaResultCompany entity);
}