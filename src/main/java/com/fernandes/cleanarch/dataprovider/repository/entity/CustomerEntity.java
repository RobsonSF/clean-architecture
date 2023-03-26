package com.fernandes.cleanarch.dataprovider.repository.entity;

import com.fernandes.cleanarch.core.domain.Address;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "customers")
public class CustomerEntity {
    @Id
    private String id;
    private String name;
    private String cpf;
    private Address address;
    private Boolean isValidCpf;
}
