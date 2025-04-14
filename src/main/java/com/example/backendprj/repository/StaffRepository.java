package com.example.backendprj.repository;

import com.example.backendprj.domain.StaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Long, StaffEntity> {
}
