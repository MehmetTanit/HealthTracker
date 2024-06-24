package de.htwberlin.webtech.Healthtracker.Serviceklassen;

import de.htwberlin.webtech.Healthtracker.Entitäsklassen.SleepPattern;
import de.htwberlin.webtech.Healthtracker.Interface.SleepPatternRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SleepPatternService {

    @Autowired
    SleepPatternRepository sleepPatternRepository;

    public SleepPattern save(SleepPattern sleepPattern) {
        return sleepPatternRepository.save(sleepPattern);
    }

    public SleepPattern get(Long id) {
        return sleepPatternRepository.findById(id).orElseThrow(RuntimeException::new);
    }
}
