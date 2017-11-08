package com.khoubyari.example.dao.jpa;

import com.khoubyari.example.domain.Gender;
import com.khoubyari.example.domain.Industry;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Repository can be used to delegate CRUD operations against the data source: http://goo.gl/P1J8QH
 * 処理を渡してやってもらう感じ？CREATEとかUPDATEとか
 */
public interface IndustryRepository extends PagingAndSortingRepository<Industry, Integer> {
    //User findHotelByCity(String city);
    //Page findAll(Pageable pageable);
}
