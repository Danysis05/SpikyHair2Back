package com.spikhair2.spikyhair2.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "reservas")
@Data
public class Reservas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "id_cliente", nullable = false)
    private Long idCliente;
    @Column(name = "id_peluqueria", nullable = false)
    private Long idPeluqueria;
    @Column(name = "id_servicio", nullable = false)
    private Long idServicio;
    @Column(nullable = false)
    private String fecha;
    @Column(nullable = false)
    private String hora;

}
