package com.coppel.configuraciones.repositories;

import com.coppel.configuraciones.models.EmpresasModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresasRepository extends JpaRepository <EmpresasModel, Long> {

}
