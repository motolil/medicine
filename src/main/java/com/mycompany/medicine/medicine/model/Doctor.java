package com.mycompany.medicine.medicine.model;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "doctors")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    private int speciality_id;

    public Doctor() {
    }

    public Doctor(String name, int speciality_id) {
        this.name = name;
        this.speciality_id = speciality_id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeciality_id() {
        return speciality_id;
    }

    public void setSpeciality_id(int speciality_id) {
        this.speciality_id = speciality_id;
    }

    @Override
    public String toString() {
        return "Доктор{" +
                ", Имя ='" + name + '\'' +
                ", Специальность =" + speciality_id +
                '}';
    }
}

