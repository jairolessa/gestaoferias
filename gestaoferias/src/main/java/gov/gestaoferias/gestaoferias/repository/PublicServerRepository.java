package gov.gestaoferias.gestaoferias.repository;

import gov.gestaoferias.gestaoferias.model.PublicServer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PublicServerRepository extends JpaRepository<PublicServer, Long> {
    Optional<PublicServer> findByCpf(String cpf);
}
