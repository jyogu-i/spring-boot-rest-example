package net.mybrainlab.sync.naimono.dao;

import com.example.mshige1979.server.db.config.AppConfig;
import net.mybrainlab.sync.naimono.entity.CaResultIndustry;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = AppConfig.class)
public interface CaResultIndustryDao {

    /**
     * @param resultIndustryId
     * @return the CaResultIndustry entity
     */
    @Select
    CaResultIndustry selectById(Integer resultIndustryId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(CaResultIndustry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(CaResultIndustry entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(CaResultIndustry entity);
}