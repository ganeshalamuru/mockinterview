package com.gan.mockinterview.service;

import com.gan.mockinterview.model.User;
import com.gan.mockinterview.service.dto.UserCreationDto;

import java.util.List;

public interface UserService {

    User createUser(UserCreationDto userCreationDto);

    List<User> getAllUsers();

}
