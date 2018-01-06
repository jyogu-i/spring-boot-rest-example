package net.mybrainlab.camp.repository;


import net.mybrainlab.camp.annotation.ConfigAutoDefault;
import net.mybrainlab.camp.dao.entity.UserReview;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;

import java.util.List;

@ConfigAutoDefault
@Dao
public interface UserReviewRepository {
    @Insert(sqlFile = true)
    int insert(UserReview userreview);

//    @Insert
//    @Transactional
//    int insertBasicUserPrevious(UserPrevious userprevious);
}
