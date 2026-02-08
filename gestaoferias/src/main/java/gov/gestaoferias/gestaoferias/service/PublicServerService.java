package gov.gestaoferias.gestaoferias.service;

import gov.gestaoferias.gestaoferias.dto.PublicServerDto;
import gov.gestaoferias.gestaoferias.mapper.PublicServiceMapper;
import gov.gestaoferias.gestaoferias.model.PublicServer;
import gov.gestaoferias.gestaoferias.repository.PublicServerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PublicServerService {

    private final PublicServerRepository publicServerRepository;
    private final PublicServiceMapper publicServiceMapper;

    public PublicServerService(PublicServerRepository publicServerRepository, PublicServiceMapper publicServiceMapper){
        this.publicServerRepository = publicServerRepository;
        this.publicServiceMapper = publicServiceMapper;
    }

    public ResponseEntity<?> registerPublicServer(PublicServerDto publicServerDto){
        System.out.println(publicServerDto);
        if (publicServerRepository.findByCpf(publicServerDto.getCpf()).isPresent()){
            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .body("Servidor já cadastrado!");
        }

        savePublicServer(publicServerDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Servidor cadastrado com sussesso!");
    }

    private void savePublicServer(PublicServerDto publicServerDto){
        PublicServer entity = publicServiceMapper.toEntity(publicServerDto);
        publicServerRepository.save(entity);
    }
}
