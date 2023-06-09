package com.fernandes.cleanarch.config;

import com.fernandes.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.fernandes.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.fernandes.cleanarch.dataprovider.InsertCustomerImpl;
import com.fernandes.cleanarch.dataprovider.repository.SendCpfToValidationImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(
        FindAddressByZipCodeImpl findAddressByZipCode,
        InsertCustomerImpl insertCustomer,
        SendCpfToValidationImpl sendCpfToValidationImpl
    ) {
        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer, sendCpfToValidationImpl);
    }
}
