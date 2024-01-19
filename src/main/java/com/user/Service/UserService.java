package com.user.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.DAO.User;
import com.user.Repository.UserRepository;

//UserService.java
@Service
public class UserService {
 @Autowired
 private UserRepository userRepository;

 public User registerUser(User user) {
     // Implement user registration logic, validation, etc.
     return userRepository.save(user);
 }

 public Optional<User> loginUser(String username, String password) {
     // Implement user login logic, validate credentials, etc.
     return userRepository.findByUsername(username);
 }
}

