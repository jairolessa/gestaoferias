package gov.gestaoferias.gestaoferias.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Vacation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String acquisitionPeriod;
    private Integer daysFirstPeriod;
    private Date startFirstPeriod;
    private Date endFirstPeriod;
    private Integer daysSecondPeriod;
    private Date startSecondPeriod;
    private Date endSecondPeriod;
    private Integer daysThirdPeriod;
    private Date startThirdPeriod;
    private Date endThirdPeriod;

    @OneToOne
    private PublicServer publicServer;

    @OneToMany(mappedBy = "vacation", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Change> changes = new ArrayList<>();
}
