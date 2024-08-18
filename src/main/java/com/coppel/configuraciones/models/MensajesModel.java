package com.coppel.configuraciones.models;

import jakarta.persistence.*;
import lombok.Data;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "mensajes")
@Data
public class MensajesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long numerodeMensaje;

    @Size(min = 5, max = 100)
    @Column(length = 100, nullable = false)
    private String mensaje;

    @Column(name = "duracion", nullable = false)
    private Long duracion;

    @Column(name = "puedeCerrarse", nullable = false)
    private Boolean puedeCerrarse;
    //private Long tipoMensaje;

    @Column(name = "status", nullable = false)
    private char status;

    @ManyToOne
    @JoinColumn(name = "idSistema", nullable = false, referencedColumnName = "idSistema")
    private SistemasModel sistema;

    @ManyToOne
    @JoinColumn(name = "idEmpresa", nullable = false, referencedColumnName = "idEmpresa")
    private EmpresasModel empresa;

    @ManyToOne
    @JoinColumn(name = "idPais", nullable = false, referencedColumnName = "idPais")
    private PaisesModel pais;

    @ManyToOne
    @JoinColumn(name = "idTipoMensaje", nullable = false, referencedColumnName = "idTipoMensaje")
    private TipoMensajesModel tipoMensaje;



}
