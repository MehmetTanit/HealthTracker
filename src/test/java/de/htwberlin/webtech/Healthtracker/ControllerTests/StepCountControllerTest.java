package de.htwberlin.webtech.Healthtracker.ControllerTests;

import de.htwberlin.webtech.Healthtracker.Controller.StepCountController;
import de.htwberlin.webtech.Healthtracker.Entitäsklassen.StepCount;
import de.htwberlin.webtech.Healthtracker.Serviceklassen.StepCountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(StepCountController.class)
public class StepCountControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private StepCountService stepCountService;

    @Test
    public void testGetStepCounts() throws Exception {
        // Test data and service mock
        StepCount sc1 = new StepCount(LocalDateTime.of(2023, 1, 1, 10, 0, 0), 10000, 1.0, "steps");
        sc1.setId(1L);

        StepCount sc2 = new StepCount(LocalDateTime.of(2023, 1, 2, 10, 0, 0), 15000, 1.0, "steps");
        sc2.setId(2L);

        List<StepCount> stepCounts = Arrays.asList(sc1, sc2);
        when(stepCountService.getAllStepCounts()).thenReturn(stepCounts);


        String expected = "[{\"id\":1,\"dateRecorded\":\"2023-01-01T10:00:00\",\"stepCount\":10000,\"value\":1.0,\"unit\":\"steps\"}," +
                "{\"id\":2,\"dateRecorded\":\"2023-01-02T10:00:00\",\"stepCount\":15000,\"value\":1.0,\"unit\":\"steps\"}]";


        this.mockMvc.perform(get("/StepCounts/stepcount"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().string(containsString(expected)));
    }
}
