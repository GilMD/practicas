package com.coppel.configuraciones.services;

import com.coppel.configuraciones.models.UserModel;
import com.coppel.configuraciones.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

//    public UserModel getAdminUser(){
//        return userRepository.findByUsername("admin");
//    }

    public boolean VerificarUsuario(String user, String password){
        UserModel userModel = userRepository.findByUsername(user);

//        System.out.println("Esta es la contraseña: " + passwordEncoder.encode("configuraciones"));
        if(user != null){
            return passwordEncoder.matches(password, userModel.getPassword());
        }
        return false;
    }
}
