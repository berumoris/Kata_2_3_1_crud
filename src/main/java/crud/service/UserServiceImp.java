package crud.service;

import crud.dao.UserDaoImp;
import crud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    private final UserDaoImp userDao;

    public UserServiceImp(UserDaoImp userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User show(long id) {
        return userDao.show(id);
    }

    @Override
    public List<User> getSeveralUsers(int count) {
        return userDao.getSeveralUsers(count);
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void update(long id, User user) {
        userDao.update(id, user);
    }

    @Override
    public void delete(long id) {
        userDao.delete(id);
    }
}

