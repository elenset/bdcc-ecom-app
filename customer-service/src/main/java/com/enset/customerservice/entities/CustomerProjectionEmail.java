package com.enset.customerservice.entities;

import com.enset.customerservice.entities.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "email", types = Customer.class)

public interface CustomerProjectionEmail {
    String getEmail();
}
