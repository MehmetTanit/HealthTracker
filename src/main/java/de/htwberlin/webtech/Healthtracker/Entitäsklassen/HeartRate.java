package de.htwberlin.webtech.Healthtracker.Entitäsklassen;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class HeartRate extends HealthMetricGenerisch {
    private int heartRateValue;

    public HeartRate() {}

    public HeartRate(int id, int userId, LocalDateTime dateRecorded, int heartRateValue) {
        super(id, userId, dateRecorded, "HeartRate", heartRateValue, "bpm");
        this.heartRateValue = heartRateValue;
    }

    public int getHeartRateValue() {
        return heartRateValue;
    }

    public void setHeartRateValue(int heartRateValue) {
        this.heartRateValue = heartRateValue;
    }

    @Override
    public double getValue() {
        return this.heartRateValue;
    }

    @Override
    public void setValue(double value) {
        this.heartRateValue = (int) value;
    }
}
