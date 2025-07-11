package gov.gestaoferias.gestaoferias.model;

public enum UserType {

    MANEGER("administrador"),
    COMMON ("comum");

    private String userType;

    UserType(String userType) {
        this.userType = userType;
    }
}
