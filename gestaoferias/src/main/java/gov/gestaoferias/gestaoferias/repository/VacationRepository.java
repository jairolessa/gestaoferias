package gov.gestaoferias.gestaoferias.repository;

import gov.gestaoferias.gestaoferias.model.Vacation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacationRepository extends JpaRepository<Vacation, Long> {
}
