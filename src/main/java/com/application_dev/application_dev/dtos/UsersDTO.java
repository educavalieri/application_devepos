package com.application_dev.application_dev.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class UsersDTO {

    private String name;
    private String lastName;
    private String cpf;
    private String email;
    private String password;

}
