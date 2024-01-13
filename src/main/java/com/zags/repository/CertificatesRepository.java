package com.zags.repository;

import com.zags.entity.Certificates;
import com.zags.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface CertificatesRepository extends JpaRepository<Certificates,Long> {
    List<Certificates> findByIdPerson(Person person);
    void deleteByIdPerson(Person person);
    Certificates findById(int id);
}
