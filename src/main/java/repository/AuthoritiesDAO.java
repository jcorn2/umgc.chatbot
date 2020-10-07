package repository;

import model.Authorities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthoritiesDAO extends JpaRepository<Authorities, Integer> {
}
