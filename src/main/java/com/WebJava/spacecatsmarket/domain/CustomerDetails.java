package com.WebJava.spacecatsmarket.domain;

import com.WebJava.spacecatsmarket.common.CommunicationChannel;
import java.util.List;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class CustomerDetails {

    Long id;
    String name;
    String address;
    String phoneNumber;
    String email;
    List<CommunicationChannel> preferredChannel;
}
