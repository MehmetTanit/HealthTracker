package de.htwberlin.webtech.Healthtracker.Entitäsklassen;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class SleepPattern {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dateRecorded;
    private double sleepDuration;

    public SleepPattern() {
    }

    public SleepPattern(LocalDateTime dateRecorded, int sleepDuration, double value) {
        this.dateRecorded = dateRecorded;
        this.sleepDuration = sleepDuration;
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

    public double getSleepDuration() {
        return sleepDuration;
    }

    public void setSleepDuration(int sleepDuration) {
        this.sleepDuration = sleepDuration;
    }
}
