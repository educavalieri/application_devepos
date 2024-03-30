package com.application_dev.application_dev.services;

import com.application_dev.application_dev.dtos.UsersDTO;
import com.application_dev.application_dev.entities.Users;

import java.util.List;

public interface UserService {

    UsersDTO findByEmail(String email);

    UsersDTO findById(Long id);

    List<UsersDTO> findAll();

    void delete (Long id);

    UsersDTO save(UsersDTO usersDTO);

}
