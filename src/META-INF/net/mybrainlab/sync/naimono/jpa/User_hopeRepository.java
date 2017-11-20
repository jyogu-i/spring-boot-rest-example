package com.khoubyari.example.dao.jpa;

import com.khoubyari.example.domain.Request;
import com.khoubyari.example.domain.User_hope;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Repository can be used to delegate CRUD operations against the data source: http://goo.gl/P1J8QH
 * 処理を渡してやってもらう感じ？CREATEとかUPDATEとか
 */
public interface User_hopeRepository extends PagingAndSortingRepository<User_hope, String> {
   // User_hope findHotelByCity(String city);
   // Page findAll(Pageable pageable);
}
