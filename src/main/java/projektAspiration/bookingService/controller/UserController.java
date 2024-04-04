package projektAspiration.bookingService.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import projektAspiration.bookingService.model.User;
import projektAspiration.bookingService.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private UserService service;

    // public UserController(UserService service) { this.service = service; }

    @PostMapping("/POST")
    public User save(@Valid @RequestBody User user) {
        return service.save(user);
    }

    @GetMapping("/{id}/GET")
    public User getActiveUserById(@PathVariable int id) {
        return service.getActiveUserById(id);
    }
}
