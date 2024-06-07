package kinder.kinder.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "turno_caja")
public class TurnoCaja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;
    private Double saldoInicial;
    private Double saldoFinal;

    @ManyToOne
    @JoinColumn(name = "id")
    private Caja caja;

    @ManyToOne
    @JoinColumn(name = "id")
    private Usuario usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public LocalDateTime getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(LocalDateTime fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    public Double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(Double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public Double getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(Double saldoFinal) {
        this.saldoFinal = saldoFinal;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "TurnoCaja [id=" + id + ", fechaHoraInicio=" + fechaHoraInicio + ", fechaHoraFin=" + fechaHoraFin
                + ", saldoInicial=" + saldoInicial + ", saldoFinal=" + saldoFinal + ", caja=" + caja + ", usuario="
                + usuario + "]";
    }

}
