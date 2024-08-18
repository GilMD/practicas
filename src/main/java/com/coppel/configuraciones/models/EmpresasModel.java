package com.coppel.configuraciones.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "empresas")
@Data
public class EmpresasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long idEmpresa;

    @Column(name = "nombreEmpresa",nullable = false)
    private String nombreEmpresa;




}
