package com.enset.billingservice.repository;

import com.enset.billingservice.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill,Long> {
}
