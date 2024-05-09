package me.fatezero.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import me.fatezero.service.UserService;
import me.fatezero.repository.UserRepository;
import me.fatezero.service.dto.UserDto;
import me.fatezero.entity.User;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public UserDto findById(long id) {
        User user = userRepository.findById(id).orElseGet(User::new);
        return user;
    }
}
