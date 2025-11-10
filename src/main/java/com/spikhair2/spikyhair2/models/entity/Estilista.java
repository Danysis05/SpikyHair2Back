package com.spikhair2.spikyhair2.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "estilistas")
@Data
public class Estilista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 80)
    private String nombre;

    @Column(length = 150)
    private String especialidad;

    @Column(length = 15)
    private String telefono;

    @Column(length = 100)
    private String email;

    @Column(length = 255)
    private String imagen;// Ruta o URL de la foto del estilista

    @ManyToOne
    @JoinColumn(name = "peluqueria_id", nullable = false)
    private Peluqueria peluqueria;
    


}
