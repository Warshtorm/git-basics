package com.services;

import com.models.Equipment;
import com.models.firebarrels.Firebarrel;
import com.models.firebarrels.fb_templates.Sprk8;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService {

    public List<Equipment> list() {
        return List.of(new Firebarrel(),
                new Sprk8());
    }
}
