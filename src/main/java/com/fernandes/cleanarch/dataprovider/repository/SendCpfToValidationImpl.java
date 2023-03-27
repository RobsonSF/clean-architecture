package com.fernandes.cleanarch.dataprovider.repository;

import com.fernandes.cleanarch.core.dataprovider.SendCpfToValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SendCpfToValidationImpl implements SendCpfToValidation {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    @Override
    public void send(String cpf) {
        kafkaTemplate.send("tp-cpf-validation", cpf);
    }
}
