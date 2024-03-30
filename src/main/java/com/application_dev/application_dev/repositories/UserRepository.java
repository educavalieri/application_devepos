package com.application_dev.application_dev.repositories;

import com.application_dev.application_dev.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {

    Users findByEmail(String email);
}
