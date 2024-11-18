package com.enset.billingservice.entities;


import com.enset.billingservice.model.Customer;
import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder
public class Bill {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date billingDate;
    private long customerId;
    @OneToMany(mappedBy = "bill")
    private List<ProductItem> productItems = new ArrayList<>();
    @Transient private Customer customer;
}
