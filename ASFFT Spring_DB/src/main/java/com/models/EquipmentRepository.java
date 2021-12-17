package com.models;

import com.models.firebarrels.Firebarrel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentRepository extends JpaRepository<Firebarrel, Long> {
}
