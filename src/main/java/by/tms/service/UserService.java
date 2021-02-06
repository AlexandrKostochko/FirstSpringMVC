package by.tms.service;

import by.tms.entity.User;
import by.tms.storage.InMemoryUserStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {

    @Autowired
    InMemoryUserStorage inMemoryUserStorage;

    public User getByLogin(String login) {
        if (inMemoryUserStorage.contains(login)){
            User byLogin = inMemoryUserStorage.getByLogin(login);
            return byLogin;
        }
        return null;
    }

    public boolean add(User user) {
        if (inMemoryUserStorage.contains(user.getLogin())) {
            return false;
        }
        inMemoryUserStorage.save(user);
        return true;
    }

    public boolean checkPassword(User user, String password) {
        if(password.equals(inMemoryUserStorage.getByLogin(user.getLogin()).getPassword())) {
            return true;
        } else {
            return false;
        }
    }
}
