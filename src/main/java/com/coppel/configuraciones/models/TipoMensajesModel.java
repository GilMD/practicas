package com.coppel.configuraciones.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "tipoMensajes")
@Data
public class TipoMensajesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idTipoMensaje;

    private String nombreTipo;
    private String color;


}
