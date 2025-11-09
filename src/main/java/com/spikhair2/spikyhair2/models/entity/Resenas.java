package com.spikhair2.spikyhair2.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "resenas")
@Data
public class Resenas {
    @Id
    private Long id;
    @Column(name = "id_peluqueria", nullable = false)
    private Long idPeluqueria;
    @Column(name = "id_cliente", nullable = false)
    private Long idCliente;
    @Column(name = "calificacion", nullable = false)
    private int calificacion; // del 1 al 5
    @Column(name = "comentario", nullable = false)
    private String comentario;

}
