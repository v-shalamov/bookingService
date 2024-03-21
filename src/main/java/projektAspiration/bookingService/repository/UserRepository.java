package projektAspiration.bookingService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projektAspiration.bookingService.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
