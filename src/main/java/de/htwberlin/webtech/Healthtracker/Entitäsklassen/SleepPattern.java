package de.htwberlin.webtech.Healthtracker.Entitäsklassen;

import java.time.LocalDateTime;

public class SleepPattern extends HealthMetricGenerisch {
    private String sleepPatternValue;

    public SleepPattern(int id, int userId, LocalDateTime dateRecorded, String sleepPatternValue) {
        super(id, userId, dateRecorded, "SleepPattern", 0, "hours");
        this.sleepPatternValue = sleepPatternValue;
    }

    // Getter und Setter Methoden
    public String getSleepPatternValue() {
        return sleepPatternValue;
    }

    public void setSleepPatternValue(String sleepPatternValue) {
        this.sleepPatternValue = sleepPatternValue;
    }

    @Override
    public double getValue() {
        return 0; // Sleep pattern is represented as a string, so returning 0 here
    }

    @Override
    public void setValue(double value) {
        // No-op as sleep pattern is a string value
    }

    @Override
    public String getUnit() {
        return "hours";
    }
}
