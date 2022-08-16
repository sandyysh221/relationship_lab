package com.example.RelationshipLab.repositories;

import com.example.RelationshipLab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
