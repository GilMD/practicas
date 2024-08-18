package com.coppel.configuraciones.contollers;

import com.coppel.configuraciones.models.TipoMensajesModel;
import com.coppel.configuraciones.services.TipoMensajeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api-tipos-de-mensajes")
public class TipoMensajeController {

    @Autowired
    private TipoMensajeServices tipoMensajeServices;

    @GetMapping("/todos-los-tipos")
    public List<TipoMensajesModel> getTipoMensajes(){
        return tipoMensajeServices.getAllTipoMensajes();
    }
}
