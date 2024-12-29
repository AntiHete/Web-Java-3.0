package com.WebJava.spacecatsmarket.service.mapper;

import com.WebJava.spacecatsmarket.domain.order.OrderContext;
import com.WebJava.spacecatsmarket.domain.payment.Payment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PaymentMapper {

    @Mapping(target = "consumerReference", source = "customerReference")
    @Mapping(target = "cartId", source = "cartId")
    @Mapping(target = "amount", source = "totalPrice")
    @Mapping(target = "paymentAssetId", ignore = true) // we can get it from somewhere else for WebJava
    Payment toPayment(OrderContext orderContext);
}
