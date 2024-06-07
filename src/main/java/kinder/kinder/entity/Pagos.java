package kinder.kinder.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Pagos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime fechaPago;

    @ManyToOne
    @JoinColumn(name = "id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id")
    private TipoPago tipoPago;

    @ManyToOne
    @JoinColumn(name = "id")
    private MetodoPago metodoPago;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDateTime fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    @Override
    public String toString() {
        return "Pagos [id=" + id + ", fechaPago=" + fechaPago + ", usuario=" + usuario + ", tipoPago=" + tipoPago
                + ", metodoPago=" + metodoPago + "]";
    }

}
