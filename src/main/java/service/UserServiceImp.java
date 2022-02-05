package service;

import dao.UserDaoImp;
import model.User;

import java.util.List;

public class UserServiceImp implements UserService{

    UserDaoImp userDao = new UserDaoImp();

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public List<User> getSeveralUsers(int count) {
        return userDao.getSeveralUsers(count);
    }
}

