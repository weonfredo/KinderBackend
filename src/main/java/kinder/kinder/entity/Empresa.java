package kinder.kinder.entity;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empresas")
@SQLDelete(sql="UPDATE empresas SET estado = 0 WHERE id=?")
@Where(clause = "estado = 1")
public class Empresa {
    
    @Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;

    @Column
    private String nombre;

    @Column
    private String informacion; 
    
    @Column
    private String direccion;
    
    @Column
    private String telefono;
    
    @Column
    private String email;
    

    @Column 
    private Integer estado = 1;

    
    public Empresa() {
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
    
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public Integer getEstado() {
        return estado;
    }
    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    

    



}

