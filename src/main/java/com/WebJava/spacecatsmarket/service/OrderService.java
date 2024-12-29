package com.WebJava.spacecatsmarket.service;

import com.WebJava.spacecatsmarket.domain.order.Order;
import com.WebJava.spacecatsmarket.domain.order.OrderContext;

public interface OrderService {

    Order placeOrder(OrderContext orderContext);
}
