package projektAspiration.bookingService.repository;

import projektAspiration.bookingService.model.User;

import java.util.List;

public interface UserRepositoryInterface {

    User save(User product);

    List<User> getAll();

    User getById(int id);

    User update(User product);

    void deleteById(int id);
}
