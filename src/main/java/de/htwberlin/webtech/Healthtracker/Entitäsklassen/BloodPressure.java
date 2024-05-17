package de.htwberlin.webtech.Healthtracker.Entitäsklassen;

import java.time.LocalDateTime;

public class BloodPressure extends HealthMetricGenerisch {
    private String bloodPressureValue;

    public BloodPressure(int id, int userId, LocalDateTime dateRecorded, String bloodPressureValue) {
        super(id, userId, dateRecorded, "BloodPressure", 0, "mmHg");
        this.bloodPressureValue = bloodPressureValue;
    }

    // Getter und Setter Methoden
    public String getBloodPressureValue() {
        return bloodPressureValue;
    }

    public void setBloodPressureValue(String bloodPressureValue) {
        this.bloodPressureValue = bloodPressureValue;
    }

    @Override
    public String getUnit() {
        return "mmHg";
    }

    @Override
    public double getValue() {
        return 0; // Blood pressure is represented as a string, so returning 0 here
    }

    @Override
    public void setValue(double value) {
        // No-op as blood pressure is a string value
    }
}

