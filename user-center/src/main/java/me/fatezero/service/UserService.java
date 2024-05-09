package me.fatezero.service;

import me.fatezero.service.dto.UserDto;

public interface UserService {
    UserDto findById(long id);
}
