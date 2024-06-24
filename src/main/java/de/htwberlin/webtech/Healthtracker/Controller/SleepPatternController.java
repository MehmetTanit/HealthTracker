package de.htwberlin.webtech.Healthtracker.Controller;

import de.htwberlin.webtech.Healthtracker.Entitäsklassen.HeartRate;
import de.htwberlin.webtech.Healthtracker.Entitäsklassen.SleepPattern;
import de.htwberlin.webtech.Healthtracker.Serviceklassen.SleepPatternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/SleepPattern")
public class SleepPatternController {

    @Autowired
    SleepPatternService sleepPatternService;


    @PostMapping("/sleeppattern")
    public SleepPattern createSleepPattern(@RequestBody SleepPattern sleepPattern) {
        return sleepPatternService.save(sleepPattern); // Hier wurde SleepPattern korrigiert
    }

    @GetMapping("/sleeppattern")
    public List<SleepPattern> getSleepPattern() {
        return sleepPatternService.getAllSleepPatterns();
    }

}
