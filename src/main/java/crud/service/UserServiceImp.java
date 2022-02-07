package crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import crud.dao.UserDaoImp;
import crud.model.User;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private final UserDaoImp userDao;

    @Autowired
    public UserServiceImp(UserDaoImp userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional
    public User getUser(long id) {
        return userDao.getUser(id);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    @Transactional
    public void deleteUser(long id) {
        userDao.deleteUser(id);
    }

    @Override
    @Transactional
    public void createUser(User user) {
        userDao.createUser(user);
    }

}
