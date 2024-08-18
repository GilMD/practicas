package com.coppel.configuraciones.repositories;

import com.coppel.configuraciones.models.MensajesModel;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface MensajeRepository extends JpaRepository <MensajesModel, Long> {

    Optional<MensajesModel> findByNumerodeMensajeAndStatus(Long numerodeMensaje, char status);

    default Optional<MensajesModel> findByNumerodeMensajeAndStatusA(Long numerodeMensaje) {
        return findByNumerodeMensajeAndStatus(numerodeMensaje, 'A');
    }

}
