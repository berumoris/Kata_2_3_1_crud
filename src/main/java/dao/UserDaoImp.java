package dao;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImp implements UserDao {

    private List<User> getFiveUsers() {
        List<User> users = new ArrayList<>();
        User user1 = new User("Max", "Crazy", "max@mail.ru");
        User user2 = new User("Kira", "DeNiro", "kira@mail.ru");
        User user3 = new User("Johny", "Dep", "dep@mail.ru");
        User user4 = new User("Marlon", "Brando", "brando@mail.ru");
        User user5 = new User("Mario", "Puzo", "godfather@mail.ru");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        return users;
    }

    List<User> userList = getFiveUsers();
    @Override
    public List<User> getAllUsers() {
        return userList;
    }

    @Override
    public List<User> getSeveralUsers(int count) {
        return userList.subList(0, count);
    }
}