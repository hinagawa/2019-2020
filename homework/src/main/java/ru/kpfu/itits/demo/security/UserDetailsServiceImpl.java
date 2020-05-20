package ru.kpfu.itits.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.kpfu.itits.demo.models.User;
import ru.kpfu.itits.demo.repository.UserRepository;

import java.util.Optional;

@Service(value="customUserDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {
   @Autowired
   private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> userOptional=userRepository.findUserByEmail(email);
        if(userOptional.isPresent()){
            User userSimple=userOptional.get();
            return new UserDetailsImpl(userSimple);

        }
        throw new UsernameNotFoundException("User not found");
    }
}
