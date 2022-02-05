package crud.dao;

import crud.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    List<User> getSeveralUsers(int count);
    User show(long id);
    void save(User user);
}
