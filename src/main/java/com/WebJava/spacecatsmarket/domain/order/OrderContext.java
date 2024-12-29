package com.WebJava.spacecatsmarket.domain.order;

import com.WebJava.spacecatsmarket.common.ProductType;
import com.WebJava.spacecatsmarket.dto.order.OrderEntryDto;
import java.util.List;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class OrderContext {

    String cartId;
    String customerReference;
    List<OrderEntry> entries;
    Double totalPrice;
}
