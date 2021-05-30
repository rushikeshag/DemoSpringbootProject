package com.kryptominds.DemoApplication.dao;

import com.kryptominds.DemoApplication.dto.EmployerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployerProfileDao extends JpaRepository<EmployerProfile, Long> {
}
