package com.gan.mockinterview.repository;

import com.gan.mockinterview.model.User;
import com.gan.mockinterview.service.dto.UserCreationDto;

import java.util.List;

public interface UserRepository {

    User createUser(UserCreationDto userCreationDto);

    List<User> getAllUsers();

}
