package com.shrad.bookmovies.api;

import com.shrad.bookmovies.repository.model.User;
import com.shrad.bookmovies.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class UserController {
    private final UserService userService;

    public UserController(final UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
