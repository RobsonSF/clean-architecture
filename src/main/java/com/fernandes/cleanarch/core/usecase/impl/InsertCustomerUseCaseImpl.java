package com.fernandes.cleanarch.core.usecase.impl;

import com.fernandes.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.fernandes.cleanarch.core.dataprovider.InsertCustomer;
import com.fernandes.cleanarch.core.domain.Customer;
import com.fernandes.cleanarch.core.usecase.InsertCustomerUseCase;

public class InsertCustomerUseCaseImpl implements InsertCustomerUseCase {
    private FindAddressByZipCode findAddressByZipCode;
    private InsertCustomer insertCustomer;

    public InsertCustomerUseCaseImpl(
            FindAddressByZipCode findAddressByZipCode,
            InsertCustomer insertCustomer
    ) {
        this.findAddressByZipCode = findAddressByZipCode;
        this.insertCustomer = insertCustomer;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address  = this.findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        this.insertCustomer.insert(customer);
    }
}
