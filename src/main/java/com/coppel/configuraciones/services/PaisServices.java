package com.coppel.configuraciones.services;

import com.coppel.configuraciones.models.PaisesModel;
import com.coppel.configuraciones.models.SistemasModel;
import com.coppel.configuraciones.repositories.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisServices {

    @Autowired
    private PaisRepository paisRepository;

    public List<PaisesModel> getAllPaises(){
        return paisRepository.findAll();
    }
}
