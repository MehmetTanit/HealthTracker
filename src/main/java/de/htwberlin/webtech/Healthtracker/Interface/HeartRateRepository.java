package de.htwberlin.webtech.Healthtracker.Interface;

import de.htwberlin.webtech.Healthtracker.Entitäsklassen.HeartRate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface HeartRateRepository extends CrudRepository<HeartRate, Integer> {
    List<HeartRate> findAllByUserIdAndDateBetween(Integer userId, LocalDateTime startDate, LocalDateTime endDate);
    // Hier kannst du zusätzliche Abfragemethoden definieren, falls erforderlich
}
