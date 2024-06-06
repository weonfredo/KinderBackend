package kinder.kinder.entity.pagos;

import jakarta.persistence.*;
import kinder.kinder.entity.Usuario;

import java.time.LocalDateTime;

@Entity
public class TurnoCaja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;
    private Double saldoInicial;
    private Double saldoFinal;

    @ManyToOne
    @JoinColumn(name = "caja_id")
    private Caja caja;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    // getters y setters
}
