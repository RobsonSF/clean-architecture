package com.fernandes.cleanarch.entrypoint.consumer;

import com.fernandes.cleanarch.core.usecase.UpdateCustomerUseCase;
import com.fernandes.cleanarch.entrypoint.consumer.mapper.CustomerMessageMapper;
import com.fernandes.cleanarch.entrypoint.consumer.message.CustomerMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidationCpf {

    @Autowired
    private UpdateCustomerUseCase updateCustomerUseCase;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "fernandes")
    public void receive(CustomerMessage customerMessage){
        var customer = customerMessageMapper.toCostumer(customerMessage);
        updateCustomerUseCase.update(customer, customerMessage.getZipCode());
    }
}
