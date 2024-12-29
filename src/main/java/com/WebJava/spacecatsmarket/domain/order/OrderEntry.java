package com.WebJava.spacecatsmarket.domain.order;

import com.WebJava.spacecatsmarket.common.ProductType;
import java.util.List;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class OrderEntry {

    ProductType productType;
    int amount;

}
