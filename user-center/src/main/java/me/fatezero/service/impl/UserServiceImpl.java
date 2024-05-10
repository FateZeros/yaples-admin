package me.fatezero.service.impl;

import me.fatezero.entity.User;
import me.fatezero.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.fatezero.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userDao;

    @Override
    public List<User> list() {
        return userDao.findAll();
    }
}
