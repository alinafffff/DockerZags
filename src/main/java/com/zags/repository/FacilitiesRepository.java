package com.zags.repository;

import com.zags.entity.Certificates;
import com.zags.entity.Facilities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacilitiesRepository extends JpaRepository<Facilities,Long> {
}
