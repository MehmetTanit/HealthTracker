package de.htwberlin.webtech.Healthtracker.Entitäsklassen;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class StepCount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dateRecorded;
    private double value;
    private String unit;
    private int stepCount;

    public StepCount() {
    }

    public StepCount(LocalDateTime dateRecorded, int stepCount,  double value, String unit) {
        this.dateRecorded = dateRecorded;
        this.stepCount = stepCount;
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

    public int getStepCount() {
        return stepCount;
    }

    public void setStepCount(int stepCount) {
        this.stepCount = stepCount;
    }
}
