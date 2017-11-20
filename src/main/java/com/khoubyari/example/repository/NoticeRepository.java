package com.khoubyari.example.repository;


import com.khoubyari.example.annotation.ConfigAutoDefault;
import com.khoubyari.example.dao.entity.Ca;
import com.khoubyari.example.dao.entity.Notice;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.springframework.transaction.annotation.Transactional;
import static java.lang.System.*;

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
