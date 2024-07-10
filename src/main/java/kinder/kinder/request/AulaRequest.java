package kinder.kinder.request;

public class AulaRequest {
    private String nombre;
    private String descripcion;
    private Integer capacidad;
    private Integer id_seccion;
    private Integer id_grado;

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

	public Integer getId_seccion() {
		return id_seccion;
	}

	public void setId_seccion(Integer id_seccion) {
		this.id_seccion = id_seccion;
	}

	public Integer getId_grado() {
		return id_grado;
	}

	public void setId_grado(Integer id_grado) {
		this.id_grado = id_grado;
	}

    
}
