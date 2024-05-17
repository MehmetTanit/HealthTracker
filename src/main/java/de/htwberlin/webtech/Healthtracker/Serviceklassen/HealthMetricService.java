package de.htwberlin.webtech.Healthtracker.Serviceklassen;

import de.htwberlin.webtech.Healthtracker.Entitäsklassen.HealthMetricGenerisch;
import java.time.LocalDateTime;
import java.util.List;

public class HealthMetricService {

    public boolean addHealthMetric(int userId, HealthMetricGenerisch metric) {
        // Implementierung zum Hinzufügen eines Gesundheitskriteriums
        return true;
    }

    public List<HealthMetricGenerisch> getHealthMetrics(int userId, String metricType, LocalDateTime startDate, LocalDateTime endDate) {
        // Implementierung zum Abrufen von Gesundheitskriterien basierend auf Benutzer, Typ und Datum
        return List.of();
    }

    public boolean updateHealthMetric(HealthMetricGenerisch metric) {
        // Implementierung zum Aktualisieren eines Gesundheitskriteriums
        return true;
    }

    public boolean deleteHealthMetric(int metricId) {
        // Implementierung zum Löschen eines Gesundheitskriteriums
        return true;
    }
}

