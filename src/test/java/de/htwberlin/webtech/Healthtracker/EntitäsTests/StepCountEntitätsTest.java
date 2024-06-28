package de.htwberlin.webtech.Healthtracker.EntitäsTests;

import de.htwberlin.webtech.Healthtracker.Entitäsklassen.StepCount;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepCountEntitätsTest {

    @Test
    void testToString() {

        LocalDateTime dateRecorded = LocalDateTime.of(2023, 1, 1, 10, 0, 0);
        int stepCountValue = 10000;
        double value = 1.0;
        String unit = "steps";

        StepCount stepCount = new StepCount(dateRecorded, stepCountValue, value, unit);
        stepCount.setId(42L);

        String expected = "StepCount{id=42, dateRecorded=2023-01-01T10:00, stepCount=10000, value=1.0, unit='steps'}";

        String actual = stepCount.toString();

        assertEquals(expected, actual);
    }
}
