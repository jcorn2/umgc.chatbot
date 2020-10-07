package repository;

import model.ZoneLandUse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneLandUseDAO extends JpaRepository<ZoneLandUse, Integer> {
}
