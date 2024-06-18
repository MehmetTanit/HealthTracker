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


    @Autowired
    HeartRateRepository heartRateRepository;

    public HeartRate save(HeartRate heartRate) {
        return heartRateRepository.save(heartRate);
    }

    public List<HeartRate> getAllHeartRates() {
        return (List<HeartRate>) heartRateRepository.findAll();
    }
}

