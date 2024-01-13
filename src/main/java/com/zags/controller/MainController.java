package com.zags.controller;

import com.zags.entity.Certificates;
import com.zags.entity.Facilities;
import com.zags.entity.Person;
import com.zags.service.CertificatesService;
import com.zags.service.FacilitiesService;
import com.zags.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import java.lang.reflect.*;

@Controller
public class MainController {
    @Autowired
    private PersonService personService;
    @Autowired
    private FacilitiesService facilitiesService;

    @Autowired
    private CertificatesService certificatesService;

    @GetMapping("/")
    public String home(){
        return "home";
    }

//    @GetMapping("/get_certificates")
//    public String getCertificates(){
//        return "getCertificates";
//    }

    @GetMapping("/buy")
    public String buy(){
        return "buy";
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/form_person")
    public String formPerson(){
        return "formPerson";
    }

//    @GetMapping("/my_certificates")
//    public String myCertificates(){
//        return "myCertificates";
//    }

    @GetMapping("/certificate_final")
    public String certificateFinal(){
        return "certificateFinal";
    }


    /////

    @GetMapping("/personal_account")
    public String personalAccount(Model model) {
        Person person = personService.listAllDatas();
        model.addAttribute("person", person);
        return "personalAccount";
    }

    @PostMapping("/save")
    public String addPerson(@ModelAttribute Person person){
        personService.save(person);
        return "redirect:/personal_account";
    }


    @RequestMapping("/update_person/{id}")
    public String updatePerson(Model model, @PathVariable("id") int id){
        Person p = personService.getPersonById(id);
        model.addAttribute("person", p);
        return "updatePerson";
    }

    @RequestMapping("/createCertificates/1")
    public String createCertificates1(){
        certificatesService.createCertificates1();
        return "redirect:/buy";
    }

    @RequestMapping("/createCertificates/2")
    public String createCertificates2(){
        certificatesService.createCertificates2();
        return "redirect:/buy";
    }

    @RequestMapping("/createCertificates/3")
    public String createCertificates3(){
        certificatesService.createCertificates3();
        return "redirect:/buy";
    }

    @RequestMapping("/createCertificates/4")
    public String createCertificates4(){
        certificatesService.createCertificates4();
        return "redirect:/buy";
    }

    @RequestMapping("/createCertificates/5")
    public String createCertificates5(){
        certificatesService.createCertificates5();
        return "redirect:/buy";
    }

    @RequestMapping("/createCertificates/6")
    public String createCertificates6(){
        certificatesService.createCertificates6();
        return "redirect:/buy";
    }

    @RequestMapping("/createCertificates/7")
    public String createCertificates7(){
        certificatesService.createCertificates7();
        return "redirect:/buy";
    }





    @GetMapping("/get_certificates")
    public ModelAndView getAllFacilities(){
        List<Facilities>list= facilitiesService.getAllFacilities();
        return new ModelAndView("getCertificates","facility",list);
    }


    @GetMapping("/my_certificates")
    public ModelAndView getAllCertificates(){
        List<Certificates>list= certificatesService.findCertificatesByIdPerson();
        return new ModelAndView("myCertificates","certificates",list);
    }



    //last


//    @RequestMapping("/check/{id}")
//    public ModelAndView checkCertificate( @PathVariable("id") int id) throws NoSuchFieldException, IllegalAccessException {
//        Certificates c= certificatesService.getCertificateById(id);
//        c.getIdFacilities().setType("");
////        Field fi2 =c.getClass().getDeclaredField("date");
////        fi2.setAccessible(true);
////        fi2.set(c, null);
//        Field fi3 =c.getClass().getDeclaredField("actNumber");
//        fi3.setAccessible(true);
//        fi3.set(c, 0);
//        Field fi4 =c.getClass().getDeclaredField("zags");
//        fi4.setAccessible(true);
//        fi4.set(c, " ");
//        return new ModelAndView("certificateFinal","certificates",c);
//    }

    @RequestMapping("/final/{id}")
    public ModelAndView certificate( @PathVariable("id") int id){
        Certificates c= certificatesService.finalCertificates(id);
        if (c.getChecking() != 0)
        return new ModelAndView("certificateFinal","certificates",c);
        else return new ModelAndView("notReady");
    }

    @RequestMapping("/check/{id}")
    public ModelAndView updateCheck(@PathVariable("id") int id){
        certificatesService.updateCheckCertificateById(id);
        return new ModelAndView("success");
    }



//    @GetMapping("/myCertificates/{id}")
//    public String getCertificates(@PathVariable("id") int id, Facilities facilities){
//
//        return "redirect:/buy";
//    }

//    @RequestMapping("myCertificates/{id}")
//    public String getCertificates(@PathVariable("id") int id, Facilities facilities){
//        facilities.
//        Certificates c = certificatesService.saveCertificates();
//        return "redirect:/buy";
//    }

}
