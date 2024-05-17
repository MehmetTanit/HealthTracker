package de.htwberlin.webtech.Healthtracker.Serviceklassen;

import de.htwberlin.webtech.Healthtracker.Entitäsklassen.SleepPattern;
import java.time.LocalDateTime;
import java.util.List;

public class SleepPatternService {

    public boolean addSleepPattern(int userId, SleepPattern sleepPattern) {
        // Implementierung zum Hinzufügen eines Schlafmusters
        return true;
    }

    public List<SleepPattern> getSleepPatterns(int userId, LocalDateTime startDate, LocalDateTime endDate) {
        // Implementierung zum Abrufen von Schlafmustern basierend auf Benutzer und Datum
        return List.of();
    }

    public boolean updateSleepPattern(SleepPattern sleepPattern) {
        // Implementierung zum Aktualisieren eines Schlafmusters
        return true;
    }

    public boolean deleteSleepPattern(int sleepPatternId) {
        // Implementierung zum Löschen eines Schlafmusters
        return true;
    }
}
