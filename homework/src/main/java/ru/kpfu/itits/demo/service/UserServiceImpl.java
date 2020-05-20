package ru.kpfu.itits.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.kpfu.itits.demo.dto.SignUpDto;
import ru.kpfu.itits.demo.models.Role;
import ru.kpfu.itits.demo.models.User;
import ru.kpfu.itits.demo.repository.UserRepository;

import java.util.Optional;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public Optional<User> getUser(Long id) {
        return userRepository.findUserById(id);
    }
    public void signUp(SignUpDto form){
        User user=User.builder()
                .email(form.getEmail())
                .name(form.getName())
                .role(Role.USER)
                        .build();
        userRepository.save(user);
    }
}