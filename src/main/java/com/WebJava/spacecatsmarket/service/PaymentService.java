package com.WebJava.spacecatsmarket.service;

import com.WebJava.spacecatsmarket.domain.payment.Payment;
import com.WebJava.spacecatsmarket.domain.payment.PaymentTransaction;

public interface PaymentService {

    PaymentTransaction processPayment(Payment payment);

}
