package com.controllers;

import com.repositorys.EquipmentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/equipment")
public class EquipmentController {

    private final EquipmentRepository equipmentRepository;


    public EquipmentController(EquipmentRepository equipmentRepository) {
        this.equipmentRepository = equipmentRepository;
    }

    @GetMapping
    public ResponseEntity getAllEquipments(){
        return ResponseEntity.ok(equipmentRepository.findAll());
    }
}
