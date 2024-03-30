package com.application_dev.application_dev.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfigure {

    @Bean
    public ModelMapper InstanceModelMapper(){
        return new ModelMapper();
    }

}
