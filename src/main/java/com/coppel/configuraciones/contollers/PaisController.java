package com.coppel.configuraciones.contollers;

import com.coppel.configuraciones.models.PaisesModel;
import com.coppel.configuraciones.repositories.PaisRepository;
import com.coppel.configuraciones.services.PaisServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/paises")
public class PaisController {

    @Autowired
    private PaisServices paisServices;

    @GetMapping("/todos-los-paises")
    public List<PaisesModel> getPaises(){
        return paisServices.getAllPaises();
    }
}
