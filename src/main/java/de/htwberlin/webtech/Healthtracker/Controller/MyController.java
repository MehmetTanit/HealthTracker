package de.htwberlin.webtech.Healthtracker.Controller;

import de.htwberlin.webtech.Healthtracker.Entitäsklassen.HeartRate;
import de.htwberlin.webtech.Healthtracker.Serviceklassen.HeartRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@CrossOrigin(origins = {"https://healthtracker-frontend.onrender.com"})
public class MyController {

    @Autowired
    HeartRateService heartRateService;

    @PostMapping("/HeartRates")
    public HeartRate createHeartRate(@RequestBody HeartRate heartRate) {
        return heartRateService.save(heartRate);
    }

    @GetMapping("/HeartRates")
    public List<HeartRate> getHeartRates() {
        return heartRateService.getAllHeartRates();
    }

}
