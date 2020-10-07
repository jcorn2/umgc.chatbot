package repository;

import model.Zone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneDAO extends JpaRepository<Zone, String> {
}
