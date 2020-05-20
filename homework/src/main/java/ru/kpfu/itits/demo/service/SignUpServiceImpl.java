package ru.kpfu.itits.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import ru.kpfu.itits.demo.dto.SignUpDto;
import ru.kpfu.itits.demo.models.Role;
import ru.kpfu.itits.demo.models.User;
import ru.kpfu.itits.demo.repository.UserRepository;

@Component

public class SignUpServiceImpl implements SignUpService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public void signUp(SignUpDto form) {
            User user = User.builder()
                    .email(form.getEmail())
                    .hash_password(passwordEncoder.encode(form.getPassword()))
                    .name(form.getName())
                    .role(Role.USER)
                    .build();
            userRepository.save(user);


    }

}
