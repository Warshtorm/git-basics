package com.factory;


import com.equipments.Equipment;

@FunctionalInterface
public interface Factory {
    Equipment create(String device);
}
