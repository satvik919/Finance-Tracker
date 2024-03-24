package com.financetracker.userservice.service;

import com.financetracker.userservice.model.User;
import com.financetracker.userservice.model.UserDTO;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserService {
    User registerUser(UserDTO userDTO);
    User getUserByUsername(String username);
}
