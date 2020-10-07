package repository;

import model.DevelopmentStandards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevelopmentStandardsDAO extends JpaRepository<DevelopmentStandards, Integer> {
}
