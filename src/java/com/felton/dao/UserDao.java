package com.felton.dao;

import com.felton.model.User;

public interface UserDao {
    User getUser(Integer id);
    void saveUser(User user);
}
