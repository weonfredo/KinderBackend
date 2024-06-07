package kinder.kinder.entity;

import jakarta.persistence.*;

@Entity
public class Caja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String estado;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    @Override
    public String toString() {
        return "Caja [id=" + id + ", estado=" + estado + "]";
    }

    
}
