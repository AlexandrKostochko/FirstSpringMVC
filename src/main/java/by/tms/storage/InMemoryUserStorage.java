package by.tms.storage;

import by.tms.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InMemoryUserStorage {

    private static List<User> users = new ArrayList<>();
    private static int idUser = 1;

    public void save(User user) {
        user.setId(idUser);
        idUser++;
        users.add(user);
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users);
    }

    public boolean contains(String login) {
        for (User user : users) {
            if (user.getLogin().equals(login)) {
                return true;
            }
        }
        return false;
    }

    public User getByLogin(String login) {
        for (User user : users) {
            if (user.getLogin().equals(login)){
                return user;
            }
        }
        return null;
    }

}

