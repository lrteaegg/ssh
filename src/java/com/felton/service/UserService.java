package com.felton.service;

import com.felton.model.User;

public interface UserService {
    User getUser(Integer uid);
    void saveUser(User user);
}
