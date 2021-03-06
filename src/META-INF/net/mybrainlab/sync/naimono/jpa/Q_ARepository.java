package com.khoubyari.example.dao.jpa;

import com.khoubyari.example.domain.Q_A;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Repository can be used to delegate CRUD operations against the data source: http://goo.gl/P1J8QH
 * 処理を渡してやってもらう感じ？CREATEとかUPDATEとか
 */
public interface Q_ARepository extends PagingAndSortingRepository<Q_A, String> {
   // Q_A findHotelByCity(String city);
   // Page findAll(Pageable pageable);
}
