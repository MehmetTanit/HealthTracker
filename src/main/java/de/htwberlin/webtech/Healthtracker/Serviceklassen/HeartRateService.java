package de.htwberlin.webtech.Healthtracker.Serviceklassen;

import de.htwberlin.webtech.Healthtracker.Entitäsklassen.HeartRate;
import java.time.LocalDateTime;
import java.util.List;

public class HeartRateService {

    public boolean addHeartRate(int userId, HeartRate heartRate) {
        // Implementierung zum Hinzufügen einer Herzfrequenz
        return true;
    }

    public List<HeartRate> getHeartRates(int userId, LocalDateTime startDate, LocalDateTime endDate) {
        // Implementierung zum Abrufen von Herzfrequenzen basierend auf Benutzer und Datum
        return List.of();
    }

    public boolean updateHeartRate(HeartRate heartRate) {
        // Implementierung zum Aktualisieren einer Herzfrequenz
        return true;
    }

    public boolean deleteHeartRate(int heartRateId) {
        // Implementierung zum Löschen einer Herzfrequenz
        return true;
    }
}
