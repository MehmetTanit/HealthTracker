package de.htwberlin.webtech.Healthtracker.Interface;

import de.htwberlin.webtech.Healthtracker.Entitäsklassen.HeartRate;
import org.springframework.stereotype.Repository;

@Repository
public interface HeartRateRepository extends CrudRepository<HeartRate, Integer> {
    // Hier kannst du zusätzliche Abfragemethoden definieren, falls erforderlich
}
