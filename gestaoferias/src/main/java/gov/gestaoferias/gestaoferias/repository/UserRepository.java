package gov.gestaoferias.gestaoferias.repository;

import gov.gestaoferias.gestaoferias.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
