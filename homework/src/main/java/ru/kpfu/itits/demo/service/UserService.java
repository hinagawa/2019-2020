package ru.kpfu.itits.demo.service;

import org.springframework.stereotype.Service;
import ru.kpfu.itits.demo.models.User;

import java.util.Optional;

@Service
public interface UserService {
    Optional<User> getUser(Long id);
}
