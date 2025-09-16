package gov.gestaoferias.gestaoferias.model;

import jakarta.persistence.Entity;

@Entity
public class PublicServer extends Person {

    private String registration;
    private String role;
    private String specialty;
    private StatusServer status;

    public PublicServer(){
    }

    public PublicServer(String fullName, String cpf, String department, String registration, String role, String specialty, StatusServer status) {
        super(fullName, cpf, department);
        this.registration = registration;
        this.role = role;
        this.specialty = specialty;
        this.status = status;
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    @Override
    public String getFullName() {
        return super.getFullName();
    }

    @Override
    public void setFullName(String fullName) {
        super.setFullName(fullName);
    }

    @Override
    public String getCpf() {
        return super.getCpf();
    }

    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf);
    }

    @Override
    public String getDepartment() {
        return super.getDepartment();
    }

    @Override
    public void setDepartment(String department) {
        super.setDepartment(department);
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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
