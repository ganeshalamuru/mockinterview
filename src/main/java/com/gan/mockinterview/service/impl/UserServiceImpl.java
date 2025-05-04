package com.gan.mockinterview.service.impl;

import com.gan.mockinterview.model.User;
import com.gan.mockinterview.repository.UserRepository;
import com.gan.mockinterview.service.UserService;
import com.gan.mockinterview.service.dto.UserCreationDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User createUser(UserCreationDto userCreationDto) {
        return userRepository.createUser(userCreationDto);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }


}
