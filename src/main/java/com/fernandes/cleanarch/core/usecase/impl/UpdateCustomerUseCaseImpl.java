package com.fernandes.cleanarch.core.usecase.impl;

import com.fernandes.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.fernandes.cleanarch.core.dataprovider.UpdateCustomer;
import com.fernandes.cleanarch.core.domain.Customer;
import com.fernandes.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.fernandes.cleanarch.core.usecase.UpdateCustomerUseCase;

public class UpdateCustomerUseCaseImpl implements UpdateCustomerUseCase {
    private final FindCustomerByIdUseCase findCustomerByIdUseCase;
    private final FindAddressByZipCode findAddressByZipCode;
    private final UpdateCustomer updateCustomer;

    public UpdateCustomerUseCaseImpl(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCode findAddressByZipCode,
            UpdateCustomer updateCustomer) {
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.findAddressByZipCode = findAddressByZipCode;
        this.updateCustomer = updateCustomer;
    }

    @Override
    public void update(Customer customer, String zipCode) {
        this.findCustomerByIdUseCase.find(customer.getId());
        var address  = this.findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        this.updateCustomer.update(customer);
    }
}
