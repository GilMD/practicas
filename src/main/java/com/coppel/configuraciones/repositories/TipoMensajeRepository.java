package com.coppel.configuraciones.repositories;

import com.coppel.configuraciones.models.TipoMensajesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoMensajeRepository extends JpaRepository<TipoMensajesModel, Long> {

}
