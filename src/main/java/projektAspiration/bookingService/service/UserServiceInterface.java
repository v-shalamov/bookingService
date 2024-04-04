package projektAspiration.bookingService.service;

import projektAspiration.bookingService.model.User;

import javax.swing.*;
import java.util.List;

public interface UserServiceInterface {

    User save(User user);

    List<User> getAllActiveUser();

    List<User> getAllNotActiveUser();

    List<User> getAllUser();

    User getActiveUserById(int id);

    User getUserById(int id);

    void updateFirstNameUser(User user);

    void updateLastNameUser(User user);

    void updateEmailUser(User user);

    void updateUserPassword(User user);

    void updateDateOfBirthUser(User user);

    void updateIsActive(User user);

    String TransitionToNotActivityStateById(int id);

    String TransitionToANewActivityStateByFirstName(String name);

    String restoringTheActiveUserStateById(int id);

    String restoringTheActiveUserStateByFirstName(String name);

    // String generalMethodForChangingUserActivityState(String x);

    int getActiveUsersCount();

    int getNotActiveUsersCount();

    int getAllUsersCount();
}
