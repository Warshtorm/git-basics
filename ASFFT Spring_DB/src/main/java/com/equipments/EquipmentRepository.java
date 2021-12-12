package com.equipments;

import com.equipments.firebarrels.Firebarrel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentRepository extends JpaRepository<Firebarrel, Long> {
}
