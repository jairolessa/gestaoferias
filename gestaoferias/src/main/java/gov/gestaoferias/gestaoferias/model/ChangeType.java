package gov.gestaoferias.gestaoferias.model;

public enum ChangeType {

    PUBLICINTEREST ("Interesse Público"),
    PARTICULARINTEREST ("Interesse Particular");

    private String changeType;

    ChangeType(String changeType){
        this.changeType = changeType;
    }
}
