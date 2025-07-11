package gov.gestaoferias.gestaoferias.model;

import jakarta.persistence.Entity;

@Entity
public class User extends Person{

    private String userName;
    private String password;
    private UserType userType;
    private StatusUser status;

    public User(){
    }

    public User(String fullName, String cpf, String department, String userName, String password, UserType userType, StatusUser status) {
        super(fullName, cpf, department);
        this.userName = userName;
        this.password = password;
        this.userType = userType;
        this.status = status;
    }

    @Override
    public Integer getId() {
        return super.getId();
    }

    @Override
    public void setId(Integer id) {
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public StatusUser getStatus() {
        return status;
    }

    public void setStatus(StatusUser status) {
        this.status = status;
    }
}
