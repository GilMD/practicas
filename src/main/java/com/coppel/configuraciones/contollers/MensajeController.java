package com.coppel.configuraciones.contollers;


import com.coppel.configuraciones.DTO.MensajeDTO;
import com.coppel.configuraciones.models.MensajesModel;
import com.coppel.configuraciones.services.MensajeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/mensajes")
public class MensajeController {

    @Autowired
    private MensajeServices mensajeServices;


    @GetMapping("/buscar-por-id")
    public Optional<MensajesModel> buscarPorId(@RequestParam Long id) {
        return mensajeServices.obtenerMensaje(id);
    }


    @PostMapping(value = "/crear-mensaje")
    public boolean guardarMensaje(@RequestBody MensajeDTO mensaje) {
        return mensajeServices.guardarMensaje(mensaje);
    }


    @PutMapping("/actualizar-mensaje")
    public boolean actualizarMensaje(@RequestParam Long id, @RequestBody MensajeDTO mensaje) {
        return mensajeServices.actualizarMensaje(id, mensaje);
    }


    @PutMapping("/eliminar-mensaje")
    public void eliminarMensaje(@RequestBody Long id) {
        mensajeServices.eliminarMensaje(id);
    }
}
