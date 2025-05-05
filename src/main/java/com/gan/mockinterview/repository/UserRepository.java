package com.gan.mockinterview.repository;

import com.gan.mockinterview.model.User;

import java.util.List;

public interface UserRepository {

    User createUser(User user);

    List<User> getAllUsers();

}
