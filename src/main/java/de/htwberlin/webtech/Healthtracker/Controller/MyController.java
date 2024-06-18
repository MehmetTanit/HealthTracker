package de.htwberlin.webtech.Healthtracker.Controller;

import de.htwberlin.webtech.Healthtracker.Entitäsklassen.HeartRate;
import de.htwberlin.webtech.Healthtracker.Serviceklassen.HeartRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class MyController {

    private final HeartRateService heartRateService;

    @Autowired
    public MyController(HeartRateService heartRateService) {
        this.heartRateService = heartRateService;
    }

    @PostMapping("/HeartRate")
    public HeartRate addHeartRate(@RequestParam int userId, @RequestBody HeartRate heartRate) {
        return heartRateService.addHeartRate(userId, heartRate);
    }

    @GetMapping("/HeartRate")
    public List<HeartRate> getHeartRates(@RequestParam int userId, @RequestParam String startDate, @RequestParam String endDate) {
        LocalDateTime start = LocalDateTime.parse(startDate);
        LocalDateTime end = LocalDateTime.parse(endDate);
        return heartRateService.getHeartRates(userId, start, end);
    }

    @PutMapping("/HeartRate")
    public HeartRate updateHeartRate(@RequestBody HeartRate heartRate) {
        return heartRateService.updateHeartRate(heartRate);
    }

    @DeleteMapping("/HeartRate")
    public void deleteHeartRate(@RequestParam int heartRateId) {
        heartRateService.deleteHeartRate(heartRateId);
    }
}