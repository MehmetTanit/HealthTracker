package de.htwberlin.webtech.Healthtracker.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @GetMapping("/todoss")
    public List<HealthTracker> greeting() {
        HealthTracker entry = new HealthTracker(310, "120/80 mmHg ", 76,5000, "7 Stunden, gut", "5.7 mmol/L");
        HealthTracker entry1 = new HealthTracker(134, "110/80 mmHg ", 87,6000, "6 Stunden, genügend", "6.7 mmol/L");
        HealthTracker entry2 = new HealthTracker(120, "130/70 mmHg ", 80,7689, "5 Stunden, zu wenig", "7.7 mmol/L");
        HealthTracker entry3 = new HealthTracker(110, "110/60 mmHg ", 90,8696, "8 Stunden, gut", "4.7 mmol/L");
        HealthTracker entry4 = new HealthTracker(122, "112/80 mmHg ", 56,5647, "4 Stunden, zu wenig", "6.5 mmol/L");
        return List.of(entry, entry1, entry2, entry3, entry4);
    }

}
