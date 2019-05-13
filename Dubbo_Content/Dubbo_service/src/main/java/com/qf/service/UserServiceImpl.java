package com.qf.service;

import com.qf.dao.UsersDao;
import com.qf.pojo.Users;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersDao usersDao;
    @Override
    public List<Users> getAllUsers() {
        return usersDao.getAllUsers();
    }
}
