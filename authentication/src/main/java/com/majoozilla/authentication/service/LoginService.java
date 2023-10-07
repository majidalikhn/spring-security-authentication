package com.majoozilla.authentication.service;

import com.majoozilla.authentication.dao.UserRepository;
import com.majoozilla.authentication.exception.UserNotFoundException;
import com.majoozilla.authentication.model.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private final UserRepository userRepository;

    private final PasswordEncoder bCryptPasswordEncoder;

    public LoginService(UserRepository userRepository, PasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public boolean usernameExists(String userName) {
        return userRepository.findByUsername(userName).isPresent();
    }

    public User addUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public User getUserByUserName(String userName) {
        return userRepository.findByUsername(userName)
                .orElseThrow(() -> new UserNotFoundException("Patient not found"));
    }
}
