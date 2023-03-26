package com.fernandes.cleanarch.core.usecase.impl;

import com.fernandes.cleanarch.core.dataprovider.DeleteCustomerById;
import com.fernandes.cleanarch.core.dataprovider.FindCustomerById;
import com.fernandes.cleanarch.core.usecase.DeleteCustomerByIdUseCase;

public class DeleteCustomerByIdUseCaseImpl implements DeleteCustomerByIdUseCase {
    private final FindCustomerById findCustomerById;
    private final DeleteCustomerById deleteCustomerById;

    public DeleteCustomerByIdUseCaseImpl(
            FindCustomerById findCustomerById,
            DeleteCustomerById deleteCustomerById
    ){
        this.findCustomerById = findCustomerById;
        this.deleteCustomerById = deleteCustomerById;
    }

    @Override
    public void delete(String id) {
        findCustomerById.find(id);
        deleteCustomerById.delete(id);
    }
}
