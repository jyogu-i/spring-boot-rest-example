package net.mybrainlab.camp.repository;


import net.mybrainlab.camp.annotation.ConfigAutoDefault;
import net.mybrainlab.camp.dao.entity.Notice;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@ConfigAutoDefault
@Dao
public interface NoticeRepository {

    @Select
    List<Notice> selectAll();

    @Select
    List<Notice> selectDetail(Notice notice);

    @Insert
    @Transactional
    int insert(Notice notice);

}
