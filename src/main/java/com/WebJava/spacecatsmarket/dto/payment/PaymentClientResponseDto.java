package com.WebJava.spacecatsmarket.dto.payment;

import com.WebJava.spacecatsmarket.common.PaymentStatus;
import java.util.UUID;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder(toBuilder = true)
@Jacksonized
public class PaymentClientResponseDto {

    UUID uuid;
    PaymentStatus status;
    String consumerReference;
}
