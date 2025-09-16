package gov.gestaoferias.gestaoferias.repository;

import gov.gestaoferias.gestaoferias.model.Change;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChangeRepository extends JpaRepository<Change, Long> {
}
