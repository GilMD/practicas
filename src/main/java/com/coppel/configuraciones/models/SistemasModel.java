package com.coppel.configuraciones.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "sistemas")
@Data
public class SistemasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idSistema;

    @Column(name = "nombreSistema",nullable = false)
    private String nombreSistema;

}
