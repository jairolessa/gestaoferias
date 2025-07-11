package gov.gestaoferias.gestaoferias.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Change {

    @Id
    private Long id;
    private ChangeType changeType;

    @ManyToOne
    private PublicServer publicServer;

    @ManyToOne
    @JoinColumn(name = "vacation_id")
    private Vacation vacation;
}
