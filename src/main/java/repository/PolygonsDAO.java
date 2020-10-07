package repository;

import model.Polygons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolygonsDAO extends JpaRepository<Polygons, Integer> {
}
