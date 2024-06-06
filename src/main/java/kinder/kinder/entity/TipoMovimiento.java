package kinder.kinder.entity.pagos;

import jakarta.persistence.*;

@Entity
public class TipoMovimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;

    // getters y setters
}
