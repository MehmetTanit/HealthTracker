package de.htwberlin.webtech.Healthtracker.Controller;

import de.htwberlin.webtech.Healthtracker.Entitäsklassen.HeartRate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;


@RestController
@CrossOrigin(origins = {"http://localhost:5173", "http://127.0.0.1:5173", "https://healthtracker-frontend.onrender.com"})
public class MyController {

    @GetMapping("/HeartRate")
    public List<HeartRate> getHeartRates() {
        return List.of(
                new HeartRate(310, 23, LocalDateTime.of(2024, 5, 14, 10, 30), 90),
                new HeartRate(30, 13, LocalDateTime.of(2023, 5, 15, 10, 30), 80),
                new HeartRate(210, 33, LocalDateTime.of(2024, 5, 16, 10, 30), 70),
                new HeartRate(110, 13, LocalDateTime.of(2024, 5, 17, 10, 30), 100)
        );
    }
}
