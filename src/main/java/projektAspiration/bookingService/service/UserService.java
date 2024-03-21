package projektAspiration.bookingService.service;

import projektAspiration.bookingService.model.User;

import java.util.List;

public class UserService implements UserServiceInterface {

    private User user;

    public UserService(User user) {
        this.user = user;
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public List<User> getAllActiveUser() {
        return null;
    }

    @Override
    public List<User> getAllNotActiveUser() {
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public User getActiveUserById(int id) {
        return null;
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void deleteByName(String name) {

    }

    @Override
    public void restoreById(int id) {

    }

    @Override
    public int getActiveUsersCount() {
        return 0;
    }
}
