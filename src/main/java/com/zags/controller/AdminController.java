package com.zags.controller;

import com.zags.entity.Certificates;
import com.zags.entity.Person;
import com.zags.service.CertificatesService;
import com.zags.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.*;

@Controller
public class AdminController {

    @Autowired
    private PersonService personService;
    @Autowired
    private CertificatesService certificatesService;

    @GetMapping("/admin_main")
    public String adminMain(){
        return "adminMain";
    }

    @GetMapping("/all_certificates")
    public ModelAndView allCertificates(){
        List<Certificates>list= certificatesService.getAllCertificates();
        return new ModelAndView("allCertificates", "certificates",list);
    }


    @GetMapping("/delete_person")
    public ModelAndView getAllPerson(){
        List<Person>list= personService.getAllPerson();
        return new ModelAndView("deletePerson","person",list);
    }

    @RequestMapping("/deletePerson/{id}")
    public String deletePerson(@PathVariable("id")int id){
        certificatesService.deleteIdPersonFromCertificates(id);
        personService.deleteById(id);
        return "redirect:/delete_person";
    }

}
