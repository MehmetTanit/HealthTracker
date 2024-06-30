package de.htwberlin.webtech.Healthtracker.Serviceklassen;

import de.htwberlin.webtech.Healthtracker.Entitäsklassen.HeartRate;
import de.htwberlin.webtech.Healthtracker.Entitäsklassen.Weight;
import de.htwberlin.webtech.Healthtracker.Interface.WeightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeightService {

    @Autowired
    private WeightRepository weightRepository;

    public Weight save(Weight weight) {
        return weightRepository.save(weight);
    }

    public Weight get(Long id) {
        return weightRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public List<Weight> getAllWeights() {
        return (List<Weight>) weightRepository.findAll();
    }

    public void deleteWeight(Long id) {
        weightRepository.deleteById(id);
    }
}
