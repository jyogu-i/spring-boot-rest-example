package com.khoubyari.example.dao.jpa;

import com.khoubyari.example.domain.Gender;
import com.khoubyari.example.domain.Job_category;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Repository can be used to delegate CRUD operations against the data source: http://goo.gl/P1J8QH
 * 処理を渡してやってもらう感じ？CREATEとかUPDATEとか
 */
public interface Job_categoryRepository extends PagingAndSortingRepository<Job_category, Integer> {
    //User findHotelByCity(String city);
    //Page findAll(Pageable pageable);
}
