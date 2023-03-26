package com.fernandes.cleanarch.config;

import com.fernandes.cleanarch.core.dataprovider.FindCustomerById;
import com.fernandes.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.fernandes.cleanarch.dataprovider.FindCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCaseImpl findCustomerByIdUseCase(
            FindCustomerByIdImpl findCustomerById
    ){
        return new FindCustomerByIdUseCaseImpl(findCustomerById);
    }
}
