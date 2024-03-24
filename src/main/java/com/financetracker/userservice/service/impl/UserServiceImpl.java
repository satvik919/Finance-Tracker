package com.financetracker.userservice.service.impl;

import com.financetracker.userservice.model.User;
import com.financetracker.userservice.model.UserDTO;
import com.financetracker.userservice.repository.UserRepository;
import com.financetracker.userservice.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
//    private final PasswordEncoder passwordEncoder;

//    public UserServiceImpl(UserRepository userRepository) PasswordEncoder passwordEncoder) {
//        this.userRepository = userRepository;
//        this.passwordEncoder = passwordEncoder;
//    }

    @Override
    public User registerUser(UserDTO userDTO) {
        User existingUser = userRepository.findByUsername(userDTO.getUsername());
        if (existingUser != null) {
            throw new RuntimeException("Username already exists");
        }

        existingUser = userRepository.findByEmail(userDTO.getEmail());
        if (existingUser != null) {
            throw new RuntimeException("Email already registered");
        }

        User newUser = new User();
        newUser.setUsername(userDTO.getUsername());
        newUser.setEmail(userDTO.getEmail());
        newUser.setPassword(userDTO.getPassword());//passwordEncoder.encode(userDTO.getPassword()));
        // Set default role for new users
//        newUser.setRoles(Collections.singleton("ROLE_USER"));

        return userRepository.save(newUser);
    }

    @Override
    public User getUserByUsername(String username) {
        User user = userRepository.findByUsername(username);
        return user;
    }
}

