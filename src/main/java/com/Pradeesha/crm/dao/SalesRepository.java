
package com.Pradeesha.crm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Pradeesha.crm.entities.Sales;

public interface SalesRepository extends JpaRepository<Sales, Long> {
    // Pradeesha: List<Sales> findByCustomerId(Long customerId);
}
