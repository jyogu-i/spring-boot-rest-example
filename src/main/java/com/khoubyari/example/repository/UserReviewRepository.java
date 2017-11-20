package com.khoubyari.example.repository;


import com.khoubyari.example.annotation.ConfigAutoDefault;
import com.khoubyari.example.dao.entity.UserPrevious;
import com.khoubyari.example.dao.entity.UserReview;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

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
