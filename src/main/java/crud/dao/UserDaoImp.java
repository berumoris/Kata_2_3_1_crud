package crud.dao;

import crud.model.User;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {
    private static long USERS_COUNT;

    private List<User> getFiveUsers() {
        List<User> users = new ArrayList<>();
        User user1 = new User(++USERS_COUNT, "Max", "Crazy", (byte) 32);
        User user2 = new User(++USERS_COUNT,"Kira", "DeNiro", (byte) 43);
        User user3 = new User(++USERS_COUNT,"Johny", "Dep", (byte) 56);
        User user4 = new User(++USERS_COUNT,"Marlon", "Brando", (byte) 82);
        User user5 = new User(++USERS_COUNT,"Mario", "Puzo", (byte)77);

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
    public User show(long id) {
        return userList.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }

    @Override
    public List<User> getSeveralUsers(int count) {
        return userList.subList(0, count);
    }

    @Override
    public void save(User user) {
        user.setId(++USERS_COUNT);
        userList.add(user);
    }
}