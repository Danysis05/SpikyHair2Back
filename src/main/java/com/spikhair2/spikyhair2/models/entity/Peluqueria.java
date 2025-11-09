package com.spikhair2.spikyhair2.models.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "peluquerias")
@Data
public class Peluqueria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 80)
    private String nombre;

    @Column(length = 150)
    private String direccion;

    @Column(length = 50)
    private String ciudad;

    @Column(length = 15)
    private String telefono;

    @Column(length = 100)
    private String email;

    @Column(length = 100)
    private String horarioApertura; // Ejemplo: "09:00 - 18:00"

    @Column(length = 255)
    private String descripcion;

    @Column(length = 255)
    private String imagen; // Ruta o URL de la foto o logotipo

    // Relación inversa con Usuario (el dueño)
    @OneToOne(mappedBy = "peluqueria", fetch = FetchType.LAZY)
    private Usuario dueno;

    // Relacion con servicios
    @OneToMany(mappedBy = "peluqueria", cascade = CascadeType.ALL)
    private List<Servicio> servicios;

    // Relación con estilistas
    @OneToMany(mappedBy = "peluqueria", cascade = CascadeType.ALL)
    private List<Estilista> estilistas;
    
}
