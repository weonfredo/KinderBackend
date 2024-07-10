package kinder.kinder.request;

public class UsuarioRequest {

    private String username;
    private String password;
    private String lastname;
    private String firstname;
    private String email;
    private String address;
    private String numberphone;
    private Integer perfil;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getNumberphone() {
        return numberphone;
    }
    public void setNumberphone(String numberphone) {
        this.numberphone = numberphone;
    }
    public Integer getPerfil() {
        return perfil;
    }
    public void setPerfil(Integer perfil) {
        this.perfil = perfil;
    }

    
}
