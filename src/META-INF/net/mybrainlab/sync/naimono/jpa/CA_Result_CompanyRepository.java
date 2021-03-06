package com.khoubyari.example.dao.jpa;

import com.khoubyari.example.domain.CA_result_company;
import com.khoubyari.example.domain.CA_result_industry;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Repository can be used to delegate CRUD operations against the data source: http://goo.gl/P1J8QH
 * 処理を渡してやってもらう感じ？CREATEとかUPDATEとか
 */
public interface CA_Result_CompanyRepository extends PagingAndSortingRepository<CA_result_company, String> {
   // CA findHotelByCity(String city);
   // Page findAll(Pageable pageable);
}
