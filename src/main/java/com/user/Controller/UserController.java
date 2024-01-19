package com.user.Controller;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.user.DAO.User;
import com.user.Service.UserService;

//UserController.java
@RestController
@RequestMapping("/api/users")
public class UserController {
 @Autowired
 private UserService userService;

 @PostMapping("/register")
 public ResponseEntity<User> registerUser(@RequestBody User user) {
     User registeredUser = userService.registerUser(user);
     return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
 }

 @PostMapping("/login")
 public ResponseEntity<User> loginUser(@RequestParam String username, @RequestParam String password) {
     Optional<User> loggedInUser = userService.loginUser(username, password);

     if (loggedInUser.isPresent()) {
         return new ResponseEntity<>(loggedInUser.get(), HttpStatus.OK);
     } else {
         return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
     }
 }
}

