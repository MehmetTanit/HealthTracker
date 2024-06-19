package de.htwberlin.webtech.Healthtracker.Interface;

import de.htwberlin.webtech.Healthtracker.Entitäsklassen.StepCount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface StepCountRepositroy {


    @Repository
    public interface StepCountRepository extends CrudRepository<StepCount, Long> {
        // Hier kannst du zusätzliche Abfragemethoden definieren, falls erforderlich
    }
}
