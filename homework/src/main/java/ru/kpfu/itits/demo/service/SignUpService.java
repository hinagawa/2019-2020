package ru.kpfu.itits.demo.service;

import org.springframework.stereotype.Service;
import ru.kpfu.itits.demo.dto.SignUpDto;
@Service
public interface SignUpService {

    void signUp(SignUpDto form);
}
