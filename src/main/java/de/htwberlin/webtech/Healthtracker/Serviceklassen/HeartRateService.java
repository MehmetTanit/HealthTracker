package de.htwberlin.webtech.Healthtracker.Serviceklassen;

import de.htwberlin.webtech.Healthtracker.Entitäsklassen.HeartRate;
import de.htwberlin.webtech.Healthtracker.Interface.HeartRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class HeartRateService {

    private final HeartRateRepository heartRateRepository;

    @Autowired
    public HeartRateService(HeartRateRepository heartRateRepository) {
        this.heartRateRepository = heartRateRepository;
    }

    public HeartRate addHeartRate(int userId, HeartRate heartRate) {
        // Implementierung zum Hinzufügen einer Herzfrequenz
        heartRate.setUserId(userId);
        return heartRateRepository.save(heartRate);
    }

    public List<HeartRate> getHeartRates(int userId, LocalDateTime startDate, LocalDateTime endDate) {
        // Implementierung zum Abrufen von Herzfrequenzen basierend auf Benutzer und Datum
        // Diese Methode erfordert zusätzliche Implementierung im Repository, um nach Benutzer und Datum zu filtern
        return heartRateRepository.findAllByUserIdAndDateBetween(userId, startDate, endDate);
    }

    public HeartRate updateHeartRate(HeartRate heartRate) {
        // Implementierung zum Aktualisieren einer Herzfrequenz
        Optional<HeartRate> existingHeartRate = heartRateRepository.findById(heartRate.getId());
        if (existingHeartRate.isPresent()) {
            return heartRateRepository.save(heartRate);
        } else {
            throw new RuntimeException("Herzfrequenz nicht gefunden");
        }
    }

    public void deleteHeartRate(int heartRateId) {
        // Implementierung zum Löschen einer Herzfrequenz
        heartRateRepository.deleteById(heartRateId);
    }
}