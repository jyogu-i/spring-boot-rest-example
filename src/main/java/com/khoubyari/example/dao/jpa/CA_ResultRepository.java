package com.khoubyari.example.dao.jpa;

import com.khoubyari.example.domain.CA;
import com.khoubyari.example.domain.CA_result;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Repository can be used to delegate CRUD operations against the data source: http://goo.gl/P1J8QH
 * 処理を渡してやってもらう感じ？CREATEとかUPDATEとか
 */
public interface CA_ResultRepository extends PagingAndSortingRepository<CA_result, String> {
   // CA findHotelByCity(String city);
   // Page findAll(Pageable pageable);
}
