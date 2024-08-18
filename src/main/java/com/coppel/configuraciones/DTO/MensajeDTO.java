package com.coppel.configuraciones.DTO;

import lombok.Data;

@Data
public class MensajeDTO {
    private Long duracion;
    private String mensaje;
    private Boolean puedeCerrarse;
    private Long idTipoMensaje;
    private Long idEmpresa;
    private Long idSistema;
    private Long idPais;

}
