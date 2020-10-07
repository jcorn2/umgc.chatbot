package repository;

import model.CityUsesr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityUserDAO extends JpaRepository<CityUsesr, Integer> {
}
