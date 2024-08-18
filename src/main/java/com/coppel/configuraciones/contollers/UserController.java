package com.coppel.configuraciones.contollers;


import com.coppel.configuraciones.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class UserController {

    @Autowired
    private UserServices userServices;

    @PostMapping("/login")
    public boolean login(@RequestParam String user, @RequestParam String password) {
        return userServices.VerificarUsuario(user, password);
    }
}
