package com.coppel.configuraciones.contollers;


import com.coppel.configuraciones.models.SistemasModel;
import com.coppel.configuraciones.repositories.SistemasRepository;
import com.coppel.configuraciones.services.SistemasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/sistemas")
public class SistemaController {

    @Autowired
    private SistemasServices sistemasServices;

    @GetMapping("/todos-los-sistemas")
    public List<SistemasModel> getSistemas(){
        return sistemasServices.getAllSistemas();
    }
}
