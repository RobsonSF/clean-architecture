package com.fernandes.cleanarch.core.usecase.impl;

import com.fernandes.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.fernandes.cleanarch.core.dataprovider.InsertCustomer;
import com.fernandes.cleanarch.core.dataprovider.SendCpfToValidation;
import com.fernandes.cleanarch.core.domain.Customer;
import com.fernandes.cleanarch.core.usecase.InsertCustomerUseCase;

public class InsertCustomerUseCaseImpl implements InsertCustomerUseCase {
    private final FindAddressByZipCode findAddressByZipCode;
    private final InsertCustomer insertCustomer;

    private final SendCpfToValidation sendCpfToValidation;

    public InsertCustomerUseCaseImpl(
            FindAddressByZipCode findAddressByZipCode,
            InsertCustomer insertCustomer,
            SendCpfToValidation sendCpfToValidation
    ) {
        this.findAddressByZipCode = findAddressByZipCode;
        this.insertCustomer = insertCustomer;
        this.sendCpfToValidation  = sendCpfToValidation;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address  = this.findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        this.insertCustomer.insert(customer);
        this.sendCpfToValidation.send(customer.getCpf());
    }
}
