package kinder.kinder.request;

import java.util.Date;

public class AlumnoRequest {

	private String dni;
	private String nombres;
	private String apellidos;
	private Date fecha_nacimiento;
	private String sexo;
	private String lugar_nacimiento;
	private String direccion;
	private String estado_financiero;
	private Integer id_aula;
	private Integer id_apoderado;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getLugar_nacimiento() {
		return lugar_nacimiento;
	}

	public void setLugar_nacimiento(String lugar_nacimiento) {
		this.lugar_nacimiento = lugar_nacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstado_financiero() {
		return estado_financiero;
	}

	public void setEstado_financiero(String estado_financiero) {
		this.estado_financiero = estado_financiero;
	}

	public Integer getId_aula() {
		return id_aula;
	}

	public void setId_aula(Integer id_aula) {
		this.id_aula = id_aula;
	}

	public Integer getId_apoderado() {
		return id_apoderado;
	}

	public void setId_apoderado(Integer id_apoderado) {
		this.id_apoderado = id_apoderado;
	}

}
