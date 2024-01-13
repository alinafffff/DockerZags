package com.zags.service;

import com.zags.entity.Person;
import com.zags.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public void save(Person person){
        personRepository.save(person);
    }
    public Person listAllDatas(){
        return personRepository.findFirstByOrderByIdDesc();
    }

    public Person getPersonById(int id){
        return personRepository.findById((long)id).get();
    }

    public List<Person> getAllPerson(){
        return personRepository.findAll();
    }

    public void deleteById(int id){
        personRepository.deleteById((long)id);
    }

}
