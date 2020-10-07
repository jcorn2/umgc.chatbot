package repository;

import model.Maps;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MapsDAO extends JpaRepository<Maps, Integer> {
}
