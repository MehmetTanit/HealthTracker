package de.htwberlin.webtech.Healthtracker.Serviceklassen;

import de.htwberlin.webtech.Healthtracker.Entitäsklassen.StepCount;
import java.time.LocalDateTime;
import java.util.List;

public class StepCountService {

    public boolean addStepCount(int userId, StepCount stepCount) {
        // Implementierung zum Hinzufügen eines Schrittzählers
        return true;
    }

    public List<StepCount> getStepCounts(int userId, LocalDateTime startDate, LocalDateTime endDate) {
        // Implementierung zum Abrufen von Schrittzählerwerten basierend auf Benutzer und Datum
        return List.of();
    }

    public boolean updateStepCount(StepCount stepCount) {
        // Implementierung zum Aktualisieren eines Schrittzählers
        return true;
    }

    public boolean deleteStepCount(int stepCountId) {
        // Implementierung zum Löschen eines Schrittzählers
        return true;
    }
}
