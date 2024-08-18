package com.coppel.configuraciones.services;

import com.coppel.configuraciones.models.PaisesModel;
import com.coppel.configuraciones.models.TipoMensajesModel;
import com.coppel.configuraciones.repositories.TipoMensajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoMensajeServices {

    @Autowired
    private TipoMensajeRepository tipoMensajeRepository;

    public List<TipoMensajesModel> getAllTipoMensajes(){
        return tipoMensajeRepository.findAll();
    }
}
