package de.htwberlin.webtech.Healthtracker.Controller;

import de.htwberlin.webtech.Healthtracker.Entitäsklassen.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/Users")
@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

    @GetMapping()
    public List<User> getUsers() {
        return List.of(
                new User(1, "Abdüs", "password1", "user1@example.com", "1990-01-01", "male"),
                new User(2, "Efos", "password2", "user2@example.com", "1985-05-15", "female"),
                new User(3, "user3", "password3", "user3@example.com", "2000-12-24", "male")
        );
    }
}
