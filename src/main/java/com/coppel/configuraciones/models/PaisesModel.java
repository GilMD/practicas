package com.coppel.configuraciones.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "paises")
@Data
public class PaisesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idPais;

    @Column(name = "nombrePais", nullable = false)
    private String nombrePais;
}
