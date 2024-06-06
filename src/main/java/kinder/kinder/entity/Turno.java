package kinder.kinder.entity;

import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="turnos")
public class Turno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String nombre; 
	private Time horainicio;
	private Time horafinal;
	
	public Turno () {
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Time getHorainicio() {
		return horainicio;
	}
	public void setHorainicio(Time horainicio) {
		this.horainicio = horainicio;
	}
	public Time getHorafinal() {
		return horafinal;
	}
	public void setHorafinal(Time horafinal) {
		this.horafinal = horafinal;
	}
	
	

}
