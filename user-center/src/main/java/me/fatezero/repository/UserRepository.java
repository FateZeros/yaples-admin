package me.fatezero.repository;


import me.fatezero.entity.User;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> userDemoList = new ArrayList<>();

    public List<User> findAll() {
        return userDemoList;
    }
}
