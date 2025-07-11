package gov.gestaoferias.gestaoferias.model;

public enum StatusServer {

    ACTIVE ("ativo"),
    REMOVED ("removido"),
    EXONERATED ("exonerado"),
    AWAY ("afastado"),
    RETIREE ("aposentado"),
    DEATH ("obito");

    private String statusServer;

    StatusServer(String statusServer) {
        this.statusServer = statusServer;
    }
}
