package kinder.kinder.request;



public class RegisterRequest {
	
	
	
	String username;
	public RegisterRequest(String username, String password, String firstname, String lastname, String email,
			String address, String numberphone, String perfil) {
		super();
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.address = address;
		this.numberphone = numberphone;
		this.perfil = perfil;
	}
	
	String password;
	String firstname;
	String lastname;
	String email;
	String address;
	String numberphone;
	String perfil;
	
	
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
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
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	
	
	
}
