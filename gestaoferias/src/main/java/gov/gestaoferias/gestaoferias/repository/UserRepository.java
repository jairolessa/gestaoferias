package gov.gestaoferias.gestaoferias.repository;

import gov.gestaoferias.gestaoferias.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
