package kinder.kinder.request;

import java.sql.Time;

public class TurnoRequest {
	
	private String nombre;
    private Time horainicio;
    private Time horafinal;
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
