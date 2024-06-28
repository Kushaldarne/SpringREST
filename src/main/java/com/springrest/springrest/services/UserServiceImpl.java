//Implementaion Class for UserService Interface

package com.springrest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import java.util.ArrayList; // Add this import statement

import com.springrest.springrest.dao.UserDao;
import com.springrest.springrest.entites.User;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    //temporary list of users
//    List<User> list;

    //constructor
    public UserServiceImpl() {


//        list=new ArrayList<>();
//        list.add(new User(1, "Kushal", "kd@gmail.com", "kushpass"));
//        list.add(new User(2, "Darne", "dar@gmail.com", "darnepass"));
    }

    @Override
    public List<User> getUser() {
        return userDao.findAll();
    }

    @Override
    public User getUser(long userId) {

        // User u=null;
        // for(User user:list) {
        //     if(user.getId()==userId) {
        //         u=user;
        //         break;
        //     }
        // }
        return userDao.findById(userId).orElse(null);
    }

    @Override
    public User addUser(User user) {
        //list.add(user);
        userDao.save(user);
        return user;
    }

    @Override
    public User getUserByUsername(String username) {
        
        //for(User user:list) {
        //    if(user.getUsername().equals(username)) {
        //        return user;
        //    }
        //}
        return userDao.findByUsername(username);
        
    }

}
