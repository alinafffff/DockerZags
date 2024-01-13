package com.zags.service;

import com.zags.entity.Role;
import com.zags.exceptions.LoginNotFoundException;
import com.zags.exceptions.WrongPasswordError;
import com.zags.repository.AuthenticationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class AuthenticationService {

    @Autowired
    private AuthenticationRepository authenticationRepository;

    public ModelAndView signIn(String login)
            throws LoginNotFoundException {
        Role role = authenticationRepository.findByLogin(login);
        if (role==null) return new ModelAndView("home");
        return new ModelAndView("adminMain");
    }

    public void register(String login){
        Role role = new Role("user", login, "123");
        authenticationRepository.save(role);
    }

}
