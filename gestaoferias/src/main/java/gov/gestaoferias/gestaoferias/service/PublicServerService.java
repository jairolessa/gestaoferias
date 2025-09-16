package gov.gestaoferias.gestaoferias.service;

import gov.gestaoferias.gestaoferias.model.PublicServer;
import gov.gestaoferias.gestaoferias.repository.PublicServerRepository;
import org.springframework.stereotype.Service;

@Service
public class PublicServerService {

    private final PublicServerRepository publicServerRepository;

    public PublicServerService(PublicServerRepository publicServerRepository){
        this.publicServerRepository = publicServerRepository;
    }

    public void savePublicServer(PublicServer publicServer){
        publicServerRepository.save(publicServer);
    }
}
