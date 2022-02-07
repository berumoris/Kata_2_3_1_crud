package crud.service;

import crud.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUser(long id);
    void updateUser(User user);
    void deleteUser(long id);
    void createUser(User user);
}
