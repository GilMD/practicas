package com.coppel.configuraciones.repositories;

import com.coppel.configuraciones.models.PaisesModel;
import com.coppel.configuraciones.models.SistemasModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaisRepository extends JpaRepository<PaisesModel, Long> {
}
