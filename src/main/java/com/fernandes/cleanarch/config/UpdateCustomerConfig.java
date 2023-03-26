package com.fernandes.cleanarch.config;

import com.fernandes.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.fernandes.cleanarch.core.usecase.impl.UpdateCustomerUseCaseImpl;
import com.fernandes.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.fernandes.cleanarch.dataprovider.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCaseImpl updateCustomerUseCase(
            FindCustomerByIdUseCaseImpl  findCustomerByIdUseCase,
            FindAddressByZipCodeImpl findAddressByZipCode,
            UpdateCustomerImpl updateCustomer
    ) {
        return new UpdateCustomerUseCaseImpl(
                findCustomerByIdUseCase,
                findAddressByZipCode,
                updateCustomer
        );
    }
}
