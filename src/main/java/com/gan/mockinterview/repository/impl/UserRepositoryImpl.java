package com.gan.mockinterview.repository.impl;

import com.gan.mockinterview.model.User;
import com.gan.mockinterview.repository.UserRepository;
import com.gan.mockinterview.repository.rowmapper.UserRowMapper;
import com.gan.mockinterview.service.dto.UserCreationDto;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@AllArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private JdbcClient jdbcClient;

    @Override
    public User createUser(UserCreationDto userCreationDto) {
        User user = userCreationDto.createUser();
        jdbcClient.sql("INSERT INTO users (id, first_name, last_name, display_name) VALUES (:id, :first_name, :last_name, :display_name)")
                .param("id",user.getId())
                .param("first_name",user.getFirstName())
                .param("last_name",user.getLastName())
                .param("display_name",user.getDisplayName())
                .update();
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return jdbcClient.sql("SELECT id, first_name, last_name, display_name FROM users")
                .query(new UserRowMapper()).list();
    }
}
