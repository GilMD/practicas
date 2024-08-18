package com.coppel.configuraciones.services;

import com.coppel.configuraciones.models.SistemasModel;
import com.coppel.configuraciones.repositories.SistemasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SistemasServices {

    @Autowired
    private SistemasRepository sistemasRepository;

    public List<SistemasModel> getAllSistemas(){
        return sistemasRepository.findAll();
    }
}
