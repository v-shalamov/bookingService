package projektAspiration.bookingService.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import projektAspiration.bookingService.model.User;
import projektAspiration.bookingService.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService service;

    // public UserController(UserService service) { this.service = service; }

    @PostMapping("/api/signup")
    public User save(@Valid @RequestBody User user) {
        return service.save(user);
    }

    @GetMapping("/{id}")
    public User getActiveUserById(@PathVariable int id) {
        return service.getActiveUserById(id);
    }

    @GetMapping("/")
    public List<User> getActiveUserById() {
        return service.getAllUsers();
    }
}
