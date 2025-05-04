package com.gan.mockinterview.controller;

import com.gan.mockinterview.model.User;
import com.gan.mockinterview.service.UserService;
import com.gan.mockinterview.service.dto.UserCreationDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/")
    public ResponseEntity<List<User>> getUsers() {
        List<User> allUsers = userService.getAllUsers();
        return new ResponseEntity<>(allUsers, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<User> createUser(@Valid @RequestBody UserCreationDto userCreationDto) {
        User user=userService.createUser(userCreationDto);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

}
