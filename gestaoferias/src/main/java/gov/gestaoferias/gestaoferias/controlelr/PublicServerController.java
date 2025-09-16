package gov.gestaoferias.gestaoferias.controlelr;

import gov.gestaoferias.gestaoferias.dto.PublicServerDto;
import gov.gestaoferias.gestaoferias.model.PublicServer;
import gov.gestaoferias.gestaoferias.model.Vacation;
import gov.gestaoferias.gestaoferias.service.PublicServerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public-server")
@CrossOrigin(origins = "*")
public class PublicServerController {

    private final PublicServerService publicServerService;

    public PublicServerController(PublicServerService publicServerService){
        this.publicServerService = publicServerService;
    }

    @PostMapping
    public String registerPublicServer(@RequestBody PublicServerDto publicServerDto){
        System.out.print(publicServerDto.toString());
        return publicServerDto.toString();
    }
}
