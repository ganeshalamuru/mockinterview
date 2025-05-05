package com.gan.mockinterview.repository.impl;

import com.gan.mockinterview.model.User;
import com.gan.mockinterview.repository.UserRepository;
import com.gan.mockinterview.repository.rowmapper.UserRowMapper;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private JdbcClient jdbcClient;

    @Override
    public User createUser(User user) {

        jdbcClient.sql("INSERT INTO users (id, first_name, last_name, status, display_name) VALUES (:id, :first_name, :last_name, :status, :display_name)")
                .param(User.ID,user.getId())
                .param(User.FIRST_NAME,user.getFirstName())
                .param(User.LAST_NAME,user.getLastName())
                .param(User.STATUS, user.getStatus())
                .param(User.DISPLAY_NAME,user.getDisplayName())
                .update();
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return jdbcClient.sql("SELECT id, first_name, last_name, status, display_name FROM users")
                .query(new UserRowMapper()).list();
    }
}
