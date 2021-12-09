package com.example.factory;


import com.example.models.Equipment;

@FunctionalInterface
public interface Factory {
    Equipment create(String device);
}
