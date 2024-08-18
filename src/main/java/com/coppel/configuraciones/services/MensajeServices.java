package com.coppel.configuraciones.services;


import com.coppel.configuraciones.DTO.MensajeDTO;
import com.coppel.configuraciones.models.*;
import com.coppel.configuraciones.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MensajeServices {

    @Autowired
    private MensajeRepository mensajesRepository;
    @Autowired
    private TipoMensajeRepository tipoMensajeRepository;
    @Autowired
    private PaisRepository paisRepository;
    @Autowired
    private EmpresasRepository empresasRepository;
    @Autowired
    private SistemasRepository sistemasRepository;



    //para mostrar mensaje por ID pero que tenga status 'A'
    public Optional<MensajesModel> obtenerMensaje(Long numerodeMensaje) {
        return mensajesRepository.findByNumerodeMensajeAndStatusA(numerodeMensaje);
    }

    //Crear Mensaje
    public boolean guardarMensaje(MensajeDTO mensaje) {
        MensajesModel mensajeModel = new MensajesModel();

        try {
            mensajeModel.setStatus('A');
            mensajeModel.setMensaje(mensaje.getMensaje());
            mensajeModel.setDuracion(mensaje.getDuracion());
            mensajeModel.setPuedeCerrarse(mensaje.getPuedeCerrarse());

            Optional<TipoMensajesModel> tipoMensajesModel = tipoMensajeRepository.findById(mensaje.getIdTipoMensaje());
            mensajeModel.setTipoMensaje(tipoMensajesModel.get());

            Optional<PaisesModel> paisesModel = paisRepository.findById(mensaje.getIdPais());
            mensajeModel.setPais(paisesModel.get());

            Optional<EmpresasModel> empresasModel = empresasRepository.findById(mensaje.getIdEmpresa());
            mensajeModel.setEmpresa(empresasModel.get());

            Optional<SistemasModel> sistemasModel = sistemasRepository.findById(mensaje.getIdSistema());
            mensajeModel.setSistema(sistemasModel.get());

            mensajesRepository.save(mensajeModel);
            return true;
        }catch (Exception e) {
            return false;
        }
    }

    //Actualizar Mensaje
    public boolean actualizarMensaje(Long id, MensajeDTO mensaje) {
        Optional<MensajesModel> existeMensaje = mensajesRepository.findById(id);


        if (!existeMensaje.isPresent()) {
            return false;
        }

        MensajesModel mensajeExiste = existeMensaje.get();
        mensajeExiste.setMensaje(mensaje.getMensaje());
        mensajeExiste.setDuracion(mensaje.getDuracion());
        mensajeExiste.setPuedeCerrarse(mensaje.getPuedeCerrarse());

        Optional<TipoMensajesModel> tipoMensajesModel = tipoMensajeRepository.findById(mensaje.getIdTipoMensaje());
        mensajeExiste.setTipoMensaje(tipoMensajesModel.get());

        Optional<PaisesModel> paisesModel = paisRepository.findById(mensaje.getIdPais());
        mensajeExiste.setPais(paisesModel.get());

        Optional<EmpresasModel> empresasModel = empresasRepository.findById(mensaje.getIdEmpresa());
        mensajeExiste.setEmpresa(empresasModel.get());

        Optional<SistemasModel> sistemasModel = sistemasRepository.findById(mensaje.getIdSistema());
        mensajeExiste.setSistema(sistemasModel.get());

        mensajesRepository.save(mensajeExiste);
        return true;
    }

    public void eliminarMensaje(Long id) {
        MensajesModel mensaje = mensajesRepository.findById(id).orElseThrow();
        mensaje.setStatus('B');
        mensajesRepository.save(mensaje);
    }
}
