package com.fernandes.cleanarch.entrypoint.consumer.message;

import com.fernandes.cleanarch.core.domain.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerMessage {
    private String id;
    private String name;
    private String cpf;
    private Boolean isValidCpf;
    private String zipCode;
}
