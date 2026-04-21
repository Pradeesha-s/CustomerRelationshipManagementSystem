package com.Pradeesha.crm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Pradeesha.crm.entities.Interactions;

public interface InteractionsRepository extends JpaRepository<Interactions, Long> {
    // Pradeesha: List<Interaction> findByCustomerId(Long customerId);
}
