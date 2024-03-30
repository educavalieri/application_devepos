package com.application_dev.application_dev.services.Implement;

import com.application_dev.application_dev.dtos.UsersDTO;
import com.application_dev.application_dev.entities.Users;
import com.application_dev.application_dev.repositories.UserRepository;
import com.application_dev.application_dev.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceIMPL implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ModelMapper modelMapper;


    @Override
    public UsersDTO findByEmail(String email) {
        return modelMapper.map(userRepository.findByEmail(email), UsersDTO.class);
    }

    @Override
    public UsersDTO findById(Long id) {
        return modelMapper.map(userRepository.findById(id), UsersDTO.class);
    }

    @Override
    public List<UsersDTO> findAll() {
        List<Users> users = userRepository.findAll();
        return users.stream().map( user ->
                modelMapper.map(user, UsersDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        try {
            userRepository.deleteById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public UsersDTO save(UsersDTO usersDTO) {
        Users users = modelMapper.map(usersDTO, Users.class);
        try {
            userRepository.save(users);
        }catch (Exception e){
            e.printStackTrace();
        }
        UsersDTO insertedUser = modelMapper.map(findByEmail(usersDTO.getEmail()), UsersDTO.class);
        return insertedUser;
    }
}

