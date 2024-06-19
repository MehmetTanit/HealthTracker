package de.htwberlin.webtech.Healthtracker.Entitäsklassen;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class BloodPressure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dateRecorded;
    private double value;
    private String unit;
    private int systolicPressure;
    private int diastolicPressure;

    public BloodPressure() {
    }

    public BloodPressure(LocalDateTime dateRecorded, int systolicPressure, int diastolicPressure, double value, String unit) {
        this.dateRecorded = dateRecorded;
        this.systolicPressure = systolicPressure;
        this.diastolicPressure = diastolicPressure;
        this.value = value;
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public LocalDateTime getDateRecorded() {
        return dateRecorded;
    }

    public void setDateRecorded(LocalDateTime dateRecorded) {
        this.dateRecorded = dateRecorded;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSystolicPressure() {
        return systolicPressure;
    }

    public void setSystolicPressure(int systolicPressure) {
        this.systolicPressure = systolicPressure;
    }

    public int getDiastolicPressure() {
        return diastolicPressure;
    }

    public void setDiastolicPressure(int diastolicPressure) {
        this.diastolicPressure = diastolicPressure;
    }
}
