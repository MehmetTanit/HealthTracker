package de.htwberlin.webtech.Healthtracker.Serviceklassen;

import de.htwberlin.webtech.Healthtracker.Entitäsklassen.BloodPressure;
import java.time.LocalDateTime;
import java.util.List;

public class BloodPressureService {

    public boolean addBloodPressure(int userId, BloodPressure bloodPressure) {
        // Implementierung zum Hinzufügen eines Blutdruckwerts
        return true;
    }

    public List<BloodPressure> getBloodPressures(int userId, LocalDateTime startDate, LocalDateTime endDate) {
        // Implementierung zum Abrufen von Blutdruckwerten basierend auf Benutzer und Datum
        return List.of();
    }

    public boolean updateBloodPressure(BloodPressure bloodPressure) {
        // Implementierung zum Aktualisieren eines Blutdruckwerts
        return true;
    }

    public boolean deleteBloodPressure(int bloodPressureId) {
        // Implementierung zum Löschen eines Blutdruckwerts
        return true;
    }
}
