package com.WebJava.spacecatsmarket.web.mapper;

import com.WebJava.spacecatsmarket.common.ProductType;
import com.WebJava.spacecatsmarket.domain.order.Order;
import com.WebJava.spacecatsmarket.domain.order.OrderContext;
import com.WebJava.spacecatsmarket.domain.order.OrderEntry;
import com.WebJava.spacecatsmarket.dto.order.OrderEntryDto;
import com.WebJava.spacecatsmarket.dto.order.PlaceOrderRequestDto;
import com.WebJava.spacecatsmarket.dto.order.PlaceOrderResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OrderDtoMapper {


    @Mapping(target = "cartId", source = "cartId")
    @Mapping(target = "totalPrice", source = "orderDto.totalPrice")
    @Mapping(target = "customerReference", source = "customerReference")
    @Mapping(target = "entries", source = "orderDto.entries")
    OrderContext toOrderContext(String cartId, String customerReference, PlaceOrderRequestDto orderDto);

    @Mapping(target = "productType", source = "productType")
    @Mapping(target = "amount", source = "quantity")
    OrderEntry toOrderEntry(OrderEntryDto orderEntryDto);

    default ProductType toProductType(String productType) {
        return ProductType.fromDisplayName(productType);
    }

    @Mapping(target = "orderId", source = "id")
    @Mapping(target = "transactionId", source = "transactionId")
    PlaceOrderResponseDto toPlaceOrderResponseDto(Order order);
}
