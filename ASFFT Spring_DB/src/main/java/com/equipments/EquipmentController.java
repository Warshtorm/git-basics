package com.equipments;

import com.equipments.firebarrels.Firebarrel;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class EquipmentController {
    private final EquipmentRepository equipmentRepository;

    public EquipmentController(EquipmentRepository equipmentRepository) {
        this.equipmentRepository = equipmentRepository;
    }


    @GetMapping("get")
        public List<Firebarrel> doGet(){
        return  equipmentRepository.findAll();
        }

    @PostMapping("item")
    public void add(@RequestBody Firebarrel firebarrel){
        equipmentRepository.save(firebarrel);
        System.out.println("Post Firebarrel" + firebarrel);
    }


}
