package kinder.kinder.entity.pagos;

import jakarta.persistence.*;
import kinder.kinder.entity.Usuario;

import java.time.LocalDateTime;

@Entity
public class Pagos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime fechaPago;
    private Double monto;
    private String metodoPago;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    // getters y setters
}
