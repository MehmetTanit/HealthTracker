package de.htwberlin.webtech.Healthtracker.Controller;

import de.htwberlin.webtech.Healthtracker.Entitäsklassen.BloodSugar;
import de.htwberlin.webtech.Healthtracker.Serviceklassen.BloodSugarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:5173"})
@RequestMapping("/bloodsugar")
public class BloodSugarController {

    @Autowired
    private BloodSugarService bloodSugarService;

    @PostMapping("/bloodsugars")
    public BloodSugar createBloodSugar(@RequestBody BloodSugar bloodSugar) {
        return bloodSugarService.save(bloodSugar);
    }

    @GetMapping("/bloodsugars")
    public List<BloodSugar> getBloodSugars() {
        return bloodSugarService.getAllBloodSugars();
    }

    @GetMapping("/bloodsugars/{id}")
    public BloodSugar getBloodSugarById(@PathVariable Long id) {
        return bloodSugarService.get(id);
    }

    @DeleteMapping("/bloodsugars/{id}")
    public void deleteBloodSugar(@PathVariable Long id) {
        bloodSugarService.deleteBloodSugar(id);
    }
}
