package de.htwberlin.webtech.Healthtracker.Entitäsklassen;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.time.LocalDateTime;

@MappedSuperclass
public class HealthMetricGenerisch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int userId;
    private LocalDateTime dateRecorded;
    private String metricType;
    private double value;
    private String unit;

    public HealthMetricGenerisch() {
    }

    public HealthMetricGenerisch(int id, int userId, LocalDateTime dateRecorded, String metricType, double value, String unit) {
        this.id=id;
        this.userId = userId;
        this.dateRecorded = dateRecorded;
        this.metricType = metricType;
        this.value = value;
        this.unit = unit;
    }

    // Getter und Setter Methoden
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public LocalDateTime getDateRecorded() {
        return dateRecorded;
    }

    public void setDateRecorded(LocalDateTime dateRecorded) {
        this.dateRecorded = dateRecorded;
    }

    public String getMetricType() {
        return metricType;
    }

    public void setMetricType(String metricType) {
        this.metricType = metricType;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
