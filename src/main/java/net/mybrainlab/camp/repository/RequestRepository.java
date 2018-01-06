package net.mybrainlab.camp.repository;


import net.mybrainlab.camp.annotation.ConfigAutoDefault;
import net.mybrainlab.camp.dao.entity.Request;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;

@ConfigAutoDefault
@Dao
public interface RequestRepository {
    @Insert(sqlFile = true)
    int insert(Request request);
}
