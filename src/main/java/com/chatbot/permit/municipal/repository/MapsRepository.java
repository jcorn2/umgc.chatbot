package com.chatbot.permit.municipal.repository;

import com.chatbot.permit.municipal.model.Maps;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MapsRepository extends JpaRepository<Maps, Integer> {
}
