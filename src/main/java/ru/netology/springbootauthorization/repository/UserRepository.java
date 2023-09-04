package ru.netology.springbootauthorization.repository;

import ru.netology.springbootauthorization.authorities.Authorities;
import ru.netology.springbootauthorization.model.User;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserRepository {
    private Map<User, List<Authorities>> usersMap = new ConcurrentHashMap<>();

    public UserRepository() {
        usersMap.put(new User("test", "qwe123"), List.of(Authorities.READ, Authorities.WRITE));
    }

    public List<Authorities> getUserAuthorities(String user, String password) {
        for (Map.Entry<User, List<Authorities>> entry : usersMap.entrySet()) {
            if (entry.getKey().getName().equals(user) && entry.getKey().getPassword().equals(password)) {
                return entry.getValue();
            }
        }
        return Collections.EMPTY_LIST;
    }
}
