package com.coppel.configuraciones.services;

import com.coppel.configuraciones.models.EmpresasModel;
import com.coppel.configuraciones.repositories.EmpresasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaServices {

    @Autowired
    private EmpresasRepository empresasRepository;

    public List<EmpresasModel> getAllEmpresas() {
        return empresasRepository.findAll();
    }
}
