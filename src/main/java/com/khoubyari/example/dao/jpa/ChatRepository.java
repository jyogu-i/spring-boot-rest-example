package com.khoubyari.example.dao.jpa;

import com.khoubyari.example.domain.Chat;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Repository can be used to delegate CRUD operations against the data source: http://goo.gl/P1J8QH
 * 処理を渡してやってもらう感じ？CREATEとかUPDATEとか
 */
public interface ChatRepository extends PagingAndSortingRepository<Chat, String> {
    //Chat findHotelByCity(String city);
    //Page findAll(Pageable pageable);
}
