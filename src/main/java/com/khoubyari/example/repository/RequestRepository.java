package com.khoubyari.example.repository;


import com.khoubyari.example.annotation.ConfigAutoDefault;
import com.khoubyari.example.dao.entity.Contact;
import com.khoubyari.example.dao.entity.Request;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;

@ConfigAutoDefault
@Dao
public interface RequestRepository {
    @Insert(sqlFile = true)
    int insert(Request request);
}
