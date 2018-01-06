package net.mybrainlab.camp.repository;

import net.mybrainlab.camp.annotation.ConfigAutoDefault;
import net.mybrainlab.camp.dao.entity.Ca;
import net.mybrainlab.camp.dao.entity.Chat;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@ConfigAutoDefault
@Dao
public interface CaRepository {
    @Select
    Ca selectDetail(Ca ca);

    @Select
    List<Ca> selectCaLists(Chat chat);

    @Insert
    @Transactional
    int insert(Ca ca);

}
