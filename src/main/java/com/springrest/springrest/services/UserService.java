//Interface for UserService

package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entites.User;

public interface UserService {

    public List<User> getUser();

    public User getUser(long userId);

    public User getUserByUsername(String username);

    public User addUser(User user);
}
