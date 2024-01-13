package com.zags.service;

import com.zags.entity.Certificates;
import com.zags.entity.Facilities;
import com.zags.entity.Person;
import com.zags.repository.CertificatesRepository;
import com.zags.repository.PersonRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CertificatesService {
    @Autowired
    private PersonService personService;
    @Autowired
    private  FacilitiesService facilitiesService;
    @Autowired
    private CertificatesRepository certificatesRepository;

    public void createCertificates1(){
        Certificates certificates = new Certificates(personService.listAllDatas(), facilitiesService.getFacilityById(1));
        certificatesRepository.save(certificates);
    }
    public void createCertificates2(){
        Certificates certificates = new Certificates(personService.listAllDatas(), facilitiesService.getFacilityById(2));
        certificatesRepository.save(certificates);
    }
    public void createCertificates3(){
        Certificates certificates = new Certificates(personService.listAllDatas(), facilitiesService.getFacilityById(3));
        certificatesRepository.save(certificates);
    }
    public void createCertificates4(){
        Certificates certificates = new Certificates(personService.listAllDatas(), facilitiesService.getFacilityById(4));
        certificatesRepository.save(certificates);
    }
    public void createCertificates5(){
        Certificates certificates = new Certificates(personService.listAllDatas(), facilitiesService.getFacilityById(5));
        certificatesRepository.save(certificates);
    }
    public void createCertificates6(){
        Certificates certificates = new Certificates(personService.listAllDatas(), facilitiesService.getFacilityById(6));
        certificatesRepository.save(certificates);
    }
    public void createCertificates7(){
        Certificates certificates = new Certificates(personService.listAllDatas(), facilitiesService.getFacilityById(7));
        certificatesRepository.save(certificates);
    }


    public void saveCertificates(Certificates certificates){
        certificatesRepository.save(certificates);
    }

    public List<Certificates> findCertificatesByIdPerson(){
        return certificatesRepository.findByIdPerson(personService.listAllDatas());
    }
    @Transactional
    public void deleteIdPersonFromCertificates(int id){
        certificatesRepository.deleteByIdPerson(personService.getPersonById(id));
    }

    public List<Certificates> getAllCertificates(){
        return certificatesRepository.findAll();
    }

    public Certificates getCertificateById(int id){
        return certificatesRepository.findById((long)id).get();
    }


    public Certificates finalCertificates(int idCertificate){
        return certificatesRepository.findById(idCertificate);
    }

    public void save(Certificates certificates){
        certificatesRepository.save(certificates);
    }

    public void updateCheckCertificateById(int id){
        Certificates c =certificatesRepository.findById(id);
        c.setChecking(1);
        certificatesRepository.save(c);
    }



}
