package web;

public class HealthTracker {
    private int heartRate;
    private String bloodPressure;
    private double weight;
    private int stepCounter;
    private String sleepPattern;
    private String bloodSugarLevel;

    public HealthTracker(int heartRate, String bloodPressure, double weight, int stepCounter, String sleepPattern, String bloodSugarLevel) {
        this.heartRate = heartRate;
        this.bloodPressure = bloodPressure;
        this.weight = weight;
        this.stepCounter = stepCounter;
        this.sleepPattern = sleepPattern;
        this.bloodSugarLevel = bloodSugarLevel;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public double getWeight() {
        return weight;
    }

    public int getStepCounter() {
        return stepCounter;
    }

    public String getSleepPattern() {
        return sleepPattern;
    }

    public String getBloodSugarLevel() {
        return bloodSugarLevel;
    }
}


