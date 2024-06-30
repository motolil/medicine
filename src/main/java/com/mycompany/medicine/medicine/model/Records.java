package com.mycompany.medicine.medicine.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "records")
public class Records {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "patient_name")
    private String patient_name;
    private Date date;
    private int doctor;
    private String comments;

    public Records() {
    }

    public Records(int id, String patient_name, Date date, int doctor, String comments) {
        this.id = id;
        this.patient_name = patient_name;
        this.date = date;
        this.doctor = doctor;
        this.comments = comments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDoctor() {
        return doctor;
    }

    public void setDoctor(int doctor) {
        this.doctor = doctor;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Запись{" +
                "Имя пациента ='" + patient_name + '\'' +
                ", Дата и время =" + date +
                ", Доктор ='" + doctor + '\'' +
                ", Комментарии ='" + comments + '\'' +
                '}';
    }
}

