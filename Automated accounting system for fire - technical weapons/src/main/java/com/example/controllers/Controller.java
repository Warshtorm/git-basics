package com.example.controllers;

import com.example.models.Equipment;
import com.example.repo.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private EquipmentRepository equipmentRepository;

    @GetMapping("/index")
    public String main(Model model){
        Iterable<Equipment> equipment = equipmentRepository.findAll();
        model.addAttribute("equipment",  equipment);
        return "index-main";
    }
}
