package com.zags.repository;

import com.zags.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticationRepository extends JpaRepository<Role, Long> {
    Role findByLogin(String login);

}
