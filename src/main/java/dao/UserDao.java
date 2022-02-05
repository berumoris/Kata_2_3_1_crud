package dao;

import model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    List<User> getSeveralUsers(int count);
}
