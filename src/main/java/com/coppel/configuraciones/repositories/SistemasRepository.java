package com.coppel.configuraciones.repositories;


import com.coppel.configuraciones.models.SistemasModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SistemasRepository extends JpaRepository<SistemasModel, Long> {
    Optional<SistemasModel> findById (Long idSistema);
}
