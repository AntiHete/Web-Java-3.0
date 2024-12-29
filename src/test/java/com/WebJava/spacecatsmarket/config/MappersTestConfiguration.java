package com.WebJava.spacecatsmarket.config;

import com.WebJava.spacecatsmarket.service.mapper.PaymentMapper;
import com.WebJava.spacecatsmarket.service.mapper.PaymentServiceMapper;
import com.WebJava.spacecatsmarket.web.mapper.OrderDtoMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class MappersTestConfiguration {

    @Bean
    public PaymentMapper paymentMapper() {
        return Mappers.getMapper(PaymentMapper.class);
    }

    @Bean
    public PaymentServiceMapper paymentServiceMapper(){
        return Mappers.getMapper(PaymentServiceMapper.class);
    }

    @Bean
    public OrderDtoMapper orderDtoMapper() {
        return Mappers.getMapper(OrderDtoMapper.class);
    }
}
