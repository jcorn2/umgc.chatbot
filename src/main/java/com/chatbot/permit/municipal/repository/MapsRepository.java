package com.chatbot.permit.municipal.repository;

import com.chatbot.permit.municipal.model.Maps;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MapsRepository extends JpaRepository<Maps, Integer> {
    List<Maps> findByFK_POLYGON_ID(int id);
    List<Maps> findMapsDistinctBy();
}
