package com.example.demo2.registration;

import com.example.demo2.authorities.User;
import com.example.demo2.authorities.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto userRegistrationDto) {
        User user = new User(userRegistrationDto.getUsername(),userRegistrationDto.getPassword());

        user.setEnabled(true);

        return userRepository.save(user);
    }
}
