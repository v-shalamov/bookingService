package projektAspiration.bookingService.service;

import projektAspiration.bookingService.model.User;

import java.util.List;

public interface UserServiceInterface {

    User save(User user);

    List<User> getAllActiveUser();

    List<User> getAllNotActiveUser();

    List<User> getAllUser();

    User getActiveUserById(int id);

    User getUserById(int id);

    void update(User user);

    void deleteById(int id);

    void deleteByName(String name);

    void restoreById(int id);

    int getActiveUsersCount();
}
