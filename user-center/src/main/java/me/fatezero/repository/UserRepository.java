package me.fatezero.repository;

import me.fatezero.common.repository.BaseRepository;
import me.fatezero.entity.User;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseRepository<User, Long> {

}
