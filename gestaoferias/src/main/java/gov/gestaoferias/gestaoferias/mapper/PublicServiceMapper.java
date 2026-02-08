package gov.gestaoferias.gestaoferias.mapper;

import gov.gestaoferias.gestaoferias.dto.PublicServerDto;
import gov.gestaoferias.gestaoferias.model.PublicServer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PublicServiceMapper {

    PublicServer toEntity(PublicServerDto publicServerDto);
    PublicServerDto toDto(PublicServer publicServer);
}
