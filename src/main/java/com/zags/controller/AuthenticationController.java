package com.zags.controller;

import com.zags.entity.Person;
import com.zags.entity.Role;
import com.zags.exceptions.LoginNotFoundException;
import com.zags.exceptions.WrongPasswordError;
import com.zags.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping("/sign_in")
    public String signIning(){
        return "signIn";
    }

    @GetMapping("/register")
    public String registering(){
        return "register";
    }

    @RequestMapping("/vhod")
    public ModelAndView signIn(@RequestParam("login") String login, Model model)
            throws LoginNotFoundException {
        model.addAttribute("role");
        return authenticationService.signIn(login);
    }



    @RequestMapping("/register/{login}")
    public ModelAndView register(@PathVariable("login")String login){
        authenticationService.register(login);
        return new ModelAndView("index");
    }
}
