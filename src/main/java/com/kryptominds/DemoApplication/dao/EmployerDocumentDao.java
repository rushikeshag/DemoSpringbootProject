package com.kryptominds.DemoApplication.dao;

import com.kryptominds.DemoApplication.dto.EmployerDocuments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployerDocumentDao extends JpaRepository<EmployerDocuments, Long> {
}
