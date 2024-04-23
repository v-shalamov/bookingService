package projektAspiration.bookingService.service;

import projektAspiration.bookingService.model.User;
import projektAspiration.bookingService.repository.UserRepository;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService implements UserServiceInterface {

    private User user;
    private static UserRepository repository;

    public UserService(User user) {
        this.user = user;
    }

    @Override
    public User save(User user) {
        try {
            user.setRole("user");
            user.setIsActive(true);
            repository.save(user);
            return user;
        } catch (Exception e) {
            throw new NullPointerException();
        }
    }

    @Override
    public List<User> getAllActiveUser() {
        return getAllActiveUserStaticMethod();
    }

    @Override
    public List<User> getAllNotActiveUser() {
        return getAllNotActiveUserStaticMethod();
    }

    @Override
    public List<User> getAllUsers() {

        List<User> users = new ArrayList<>();

        List<User> activeUsers = getAllActiveUserStaticMethod();
        List<User> notActiveUsers = getAllNotActiveUserStaticMethod();

        for (int i = 0; i < activeUsers.size(); i++) {
            User activeUser = activeUsers.get(i);
            User notActiveUser = notActiveUsers.get(i);
            users.add(activeUser);
            users.add(notActiveUser);
        }

        return users;
    }

    @Override
    public User getActiveUserById(int id) {
        Optional<User> user = repository.findById(id).filter(User::isActive);

        if (user.isPresent()) {
            return user.orElse(null);
        }

        throw new NullPointerException("ошибка, этот пользователь либо не октивет, либо не существует");
    }

    @Override
    public User getUserById(int id) {
        return getUserByIdStaticMethod(id);
    }

    @Override
    public void updateFirstNameUser(User user) {

    }

    @Override
    public void updateLastNameUser(User user) {

    }

    @Override
    public void updateEmailUser(User user) {

    }

    @Override
    public void updateUserPassword(User user) {

    }

    @Override
    public void updateDateOfBirthUser(User user) {

    }

    @Override
    public void updateIsActive(User user) {

    }

    @Override
    public String TransitionToNotActivityStateById(int id) {
        User user = getUserByIdStaticMethod(id);

        if (user == null) {
            throw new NullPointerException("Такого юзера не существует");
        } else if (!user.isActive()) {
            String wrongValue = id + " Юзер уже неактивен";
            return wrongValue;
        } else {
            user.setIsActive(false);
            String string = id + " Юзер стал не октивен";
            return string;
        }
    }

    @Override
    public String TransitionToANewActivityStateByFirstName(String name) {
        User user = getUserByNameStaticMethod(name);

        if (user == null) {
            throw new NullPointerException("Такого юзера не существует");
        } else if (!user.isActive()) {
            String wrongValue = name + " Юзер уже неактивен";
            return wrongValue;
        } else {
            user.setIsActive(false);
            String string = name + " Юзер стал не октивен";
            return string;
        }
    }

    @Override
    public String restoringTheActiveUserStateById(int id) {
        User user = getUserByIdStaticMethod(id);

        if (user == null) {
            throw new NullPointerException("Такого юзера не существует");
        } else if (!user.isActive()) {
            String wrongValue = id + " Юзер уже неактивен";
            return wrongValue;
        } else {
            user.setIsActive(true);
            String string = id + " Юзер стал не октивен";
            return string;
        }
    }

    @Override
    public String restoringTheActiveUserStateByFirstName(String name) {
        User user = getUserByNameStaticMethod(name);

        if (user == null) {
            throw new NullPointerException("Такого юзера не существует");
        } else if (!user.isActive()) {
            String wrongValue = name + " Юзер уже неактивен";
            return wrongValue;
        } else {
            user.setIsActive(true);
            String string = name + " Юзер стал не октивен";
            return string;
        }
    }

//    @Override
//    public String generalMethodForChangingUserActivityState(String x, String methodName) {
//        User user = methodName(x);
//
//        if (user == null) {
//            throw new NullPointerException("Такого юзера не существует");
//        } else if (!user.isActive()) {
//            String wrongValue = x + " Юзер уже неактивен";
//            return wrongValue;
//        } else {
//            user.setIsActive(true);
//            String string = x + " Юзер стал не октивен";
//            return string;
//        }
//    }

    @Override
    public int getActiveUsersCount() {
        List<User> users = getAllActiveUserStaticMethod();
        int ActiveUsersCount = users.size();

        return ActiveUsersCount;
    }

    @Override
    public int getNotActiveUsersCount() {
        List<User> users = getAllNotActiveUserStaticMethod();
        int notActiveUsersCount = users.size();

        return notActiveUsersCount;
    }

    @Override
    public int getAllUsersCount() {
        List<User> users = getAllActiveUser();
        int allUsersCount = users.size();

        return allUsersCount;
    }

    @Override
    public void methodChangingUserRole(String newRole, User user) {
        user.setRole(newRole);
    }

    public static List<User> getAllActiveUserStaticMethod() {
        try {
            List<User> users = repository.findAll().stream().filter(user -> user.isActive()).toList();
            return users;
        } catch (Exception e) {
            throw new NullPointerException();
        }
    }


    public static List<User> getAllNotActiveUserStaticMethod() {
        try {
            List<User> users = repository.findAll().stream().filter(user -> !user.isActive()).toList();
            return users;
        } catch (Exception e) {
            throw new NullPointerException();
        }
    }

    public static User getUserByIdStaticMethod(int id) {
        Optional<User> user = repository.findById(id);
        return user.orElse(null);
    }

    public static User getUserByNameStaticMethod(String name) {
        User user = (User) repository.findByFirstNameUser(name);

        if (user == null) {
            throw new NullPointerException("Такого юзера не существует");
        }

        return user;
    }
}
