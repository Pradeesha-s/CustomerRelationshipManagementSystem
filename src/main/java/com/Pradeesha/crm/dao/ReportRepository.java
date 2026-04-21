package com.Pradeesha.crm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Pradeesha.crm.entities.Report;

public interface ReportRepository extends JpaRepository<Report, Long> {
    // Pradeesha: List<Report> findByReportNameContainingIgnoreCase(String name);
}
