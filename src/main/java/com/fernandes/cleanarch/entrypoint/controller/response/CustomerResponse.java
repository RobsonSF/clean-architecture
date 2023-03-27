package com.fernandes.cleanarch.entrypoint.controller.response;

import com.fernandes.cleanarch.core.domain.Address;
import lombok.Data;

@Data
public class CustomerResponse {
    private String name;
    private String cpf;
    private Boolean isValidCpf;
    private AddressResponse address;

}
