package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    List<User> list = Arrays.asList(
                new User(1, "Faseeh", "033322211122", null),
                new User(2, "Tahir", "033322211121", null),
                new User(3, "Sumair", "033322214322", null)
            );

    @Override
    public User getUser(Integer id) {
        return list.stream().filter(user -> user.getId().equals(id)).findAny().orElse(null);
    }
}