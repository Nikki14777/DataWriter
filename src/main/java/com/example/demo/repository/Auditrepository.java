package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.AuditTableEntity;

@Repository
public interface Auditrepository extends JpaRepository<AuditTableEntity, Long>{

}
