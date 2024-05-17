package de.htwberlin.webtech.Healthtracker.Entitäsklassen;

import java.time.LocalDateTime;

public class StepCount extends HealthMetricGenerisch {
    private int stepCountValue;

    public StepCount(int id, int userId, LocalDateTime dateRecorded, int stepCountValue) {
        super(id, userId, dateRecorded, "StepCount", stepCountValue, "steps");
        this.stepCountValue = stepCountValue;
    }

    // Getter und Setter Methoden
    public int getStepCountValue() {
        return stepCountValue;
    }

    public void setStepCountValue(int stepCountValue) {
        this.stepCountValue = stepCountValue;
    }

    @Override
    public double getValue() {
        return this.stepCountValue;
    }

    @Override
    public void setValue(double value) {
        this.stepCountValue = (int) value;
    }
}
