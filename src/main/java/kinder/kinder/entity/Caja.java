package kinder.kinder.entity.pagos;

import jakarta.persistence.*;

@Entity
public class Caja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String estado;

    // getters y setters
}
