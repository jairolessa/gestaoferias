package gov.gestaoferias.gestaoferias.dto;

import gov.gestaoferias.gestaoferias.model.StatusServer;

public class PublicServerDto {

    private Long id;
    private String fullName;
    private String cpf;
    private String department;
    private String registration;
    private String role;
    private String specialty;
    private StatusServer status;

    public PublicServerDto() {
    }

    public PublicServerDto(String fullName, String cpf, String department, String registration, String role, String specialty, StatusServer status) {
        this.fullName = fullName;
        this.cpf = cpf;
        this.department = department;
        this.registration = registration;
        this.role = role;
        this.specialty = specialty;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public StatusServer getStatus() {
        return status;
    }

    public void setStatus(StatusServer status) {
        this.status = status;
    }
}
