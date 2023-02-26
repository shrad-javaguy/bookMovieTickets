package com.shrad.bookmovies.service;

import com.shrad.bookmovies.repository.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    public List<User> getAllUsers() {
        return new ArrayList<User>();
    }
}
