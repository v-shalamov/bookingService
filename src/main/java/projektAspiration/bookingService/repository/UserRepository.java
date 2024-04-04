package projektAspiration.bookingService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projektAspiration.bookingService.model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByFirstNameUser(String name);
}
