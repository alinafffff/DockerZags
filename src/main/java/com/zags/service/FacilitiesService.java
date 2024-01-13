package com.zags.service;

import com.zags.entity.Certificates;
import com.zags.entity.Facilities;
import com.zags.repository.CertificatesRepository;
import com.zags.repository.FacilitiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilitiesService {

    @Autowired
    private FacilitiesRepository facilitiesRepository;

    public List<Facilities> getAllFacilities(){
        return facilitiesRepository.findAll();
    }
    public Facilities getFacilityById(int id){
        return facilitiesRepository.findById((long)id).get();
    }



}
