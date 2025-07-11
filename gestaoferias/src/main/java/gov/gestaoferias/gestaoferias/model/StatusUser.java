package gov.gestaoferias.gestaoferias.model;

public enum StatusUser {

    ACTIVE ("ativo"),
    INACTIVE ("inativo");

    private String statusUser;

    StatusUser(String statusUser){
        this.statusUser = statusUser;
    }
}
