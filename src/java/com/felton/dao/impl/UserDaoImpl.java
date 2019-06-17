package com.felton.dao.impl;

import com.felton.dao.UserDao;
import com.felton.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.naming.Name;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public User getUser(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        User user = session.get(User.class, id);
        return user;
    }

    @Override
    public void saveUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
        System.out.println("========"+user.getName());
    }
}
