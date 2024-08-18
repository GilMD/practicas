package com.coppel.configuraciones.contollers;

import com.coppel.configuraciones.models.EmpresasModel;
import com.coppel.configuraciones.services.EmpresaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/empresas")
public class EmpresasController {

    @Autowired
    private EmpresaServices empresaServices;

    @GetMapping("/todas-las-empresas")
    public List<EmpresasModel> getEmpresas(){
        return empresaServices.getAllEmpresas();
    }
}
