package com.WebJava.spacecatsmarket.service;

import com.WebJava.spacecatsmarket.domain.CustomerDetails;
import java.util.List;

public interface CustomerService {

    List<CustomerDetails> getAllCustomerDetails();

    CustomerDetails getCustomerDetailsById(Long customerId);
}
